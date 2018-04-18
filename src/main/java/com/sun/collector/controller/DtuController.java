/**
 * Project Name:MeterSocketservApp File Name:DtuController.java Package
 * Name:com.xhb.sockserv.collector Date:Mar 9, 20179:12:26 AM Copyright (c) 2017, lorisun@live.com
 * All Rights Reserved.
 * 
 */
package com.sun.collector.controller;

import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nhb.utils.nhb_utils.context.SpringContextHolder;
import com.sun.collector.attribute.DtuContext;
import com.sun.collector.base.Device;
import com.sun.collector.entity.ReceiptCollector;
import com.sun.collector.entity.ReceiptDevice;
import com.sun.collector.entity.ReceiptMeter;
import com.sun.collector.init.DtuContextMap;
import com.sun.collector.protocol.NHB_DEVICE;
import com.sun.collector.service.device.ReceiptCollectorService;
import com.sun.collector.service.device.ReceiptDeviceService;
import com.sun.collector.service.device.ReceiptMeterService;
import com.sun.collector.task.DataProcessor;
import com.sun.collector.utils.FrameUtils;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * @ClassName:DtuController
 * @Function: DTU信息处理
 * @Date: Mar 9, 2017 9:12:26 AM
 * @author sunlei
 * @version
 * @since JDK 1.8
 * @see
 */
public class DtuController {

	private static final Logger logger = LoggerFactory.getLogger(DtuController.class);

	DataProcessor dataProcessor;

	// 通道上下文属性key
	private AttributeKey<DtuContext> attrDtuContext;

	// 通道上下文属性
	private DtuContext dtuContext;

	public DtuController(AttributeKey<DtuContext> attrDtuContext) {
		this.attrDtuContext = attrDtuContext;
	}

	/**
	 * heartbeat: 处理dtu的心跳报文
	 * 
	 * @author sunlei
	 * @param ctx
	 * @param msg
	 * @since JDK 1.8
	 */
	public void heartbeat(ChannelHandlerContext ctx, byte[] msg) {
		String deviceNo = FrameUtils.getDeviceNo(msg);
		if (StringUtils.isEmpty(deviceNo)) {
			return;
		}
		updateDeviceStatus(deviceNo, ctx);
	}

	/**
	 * readDevice: 处理上传的数据报文
	 * 
	 * @author sunlei
	 * @param ctx
	 * @param msg
	 * @since JDK 1.8
	 */
	public void readDevice(ChannelHandlerContext ctx, byte[] msg) {
		String deviceNo = FrameUtils.getDeviceNo(msg);
		// 更新设备状态
		updateDeviceStatus(deviceNo, ctx);
		DtuContext dtuContext = ctx.channel().attr(attrDtuContext).get();
		if (dtuContext == null) {
			return;
		}

		Device device = dtuContext.getCurrentDevice();
		ctx.channel().attr(attrDtuContext).set(dtuContext);
		if (device == null) {
			return;
		}
		device.processReadingFrame(msg);
	}

	/**
	 * saveRegisterInfo: 处理采集器（dtu）注册信息
	 * 
	 * @author sunlei
	 * @param ctx
	 * @param msg
	 * @since JDK 1.8
	 */
	public void saveRegisterInfo(ChannelHandlerContext ctx, byte[] msg) {
		// 从数据帧获取设备No
		String deviceNo = FrameUtils.getDeviceNo(msg);
		if (StringUtils.isEmpty(deviceNo)) {
			return;
		}
		dtuContext = new DtuContext();
		dtuContext.setDeviceNo(deviceNo);
		dtuContext.setDeviceCHC(ctx);

		ReceiptCollector collector = getReceiptCollectorService().findCollectorByNo(deviceNo);
		ReceiptMeter meter = getReceiptMeterService().findMetersByCollectorId(collector.getId());
		ReceiptDevice receiptDevice = getReceiptDeviceService().findByMeterId(meter.getId());
		if (null == receiptDevice) {
			logger.warn("编号：" + deviceNo + "未配置！");
			return;
		}
		switch (meter.getProtocolType()) {
		case "MATIS_DEVICE":
			dtuContext.setCurrentDevice(new NHB_DEVICE(collector, meter, receiptDevice));
			break;

		default:
			break;
		}

		// 封装管道上下文属性
		ctx.channel().attr(attrDtuContext).set(dtuContext);
		logger.warn(ctx.channel().attr(attrDtuContext).get().getDeviceNo() + " : 编号设备注册成功!");
		// 将采集器信息 保存到缓存中
		DtuContextMap.getInstance().put(deviceNo, dtuContext);
		// 更新状态
		updateDeviceStatus(deviceNo, ctx);

		// 启动定时任务
		dataProcessor = new DataProcessor(ctx, attrDtuContext);
		ctx.executor().scheduleAtFixedRate(dataProcessor, 0, collector.getCollectionFrequency(), TimeUnit.MINUTES);
	}

	/**
	 * updateDeviceStatus: 更新设备在线状态
	 * 
	 * @author sunlei
	 * @param deviceNo
	 * @param ctx
	 * @since JDK 1.8
	 */
	private void updateDeviceStatus(String collectorNo, ChannelHandlerContext ctx) {
		ReceiptCollector collector = getReceiptCollectorService().findCollectorByNo(collectorNo);
		ReceiptMeter meter = getReceiptMeterService().findMetersByCollectorId(collector.getId());
		ReceiptDevice receiptDevice = getReceiptDeviceService().findByMeterId(meter.getId());
		Date nowTime = new Date();
		receiptDevice.setActiveTime(nowTime);
		getReceiptDeviceService().save(receiptDevice);
		if (Objects.isNull(receiptDevice)) {
			logger.error(receiptDevice + "：编号采集器未配置到回单表");
			return;
		}

	}

	private ReceiptDeviceService getReceiptDeviceService() {
		return SpringContextHolder.getBean(ReceiptDeviceService.class);
	}

	private ReceiptCollectorService getReceiptCollectorService() {
		return SpringContextHolder.getBean(ReceiptCollectorService.class);
	}

	private ReceiptMeterService getReceiptMeterService() {
		return SpringContextHolder.getBean(ReceiptMeterService.class);
	}

}
