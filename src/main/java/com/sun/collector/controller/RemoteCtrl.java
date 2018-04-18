package com.sun.collector.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nhb.utils.nhb_utils.common.StringUtil;
import com.sun.collector.attribute.DtuContext;
import com.sun.collector.command.CommandRequest;
import com.sun.collector.entity.ReceiptCollector;
import com.sun.collector.entity.ReceiptDevice;
import com.sun.collector.entity.ReceiptMeter;
import com.sun.collector.init.DtuContextMap;
import com.sun.collector.protocol.NHB_DEVICE_CTRL;
import com.sun.collector.service.device.ReceiptCollectorService;
import com.sun.collector.service.device.ReceiptDeviceService;
import com.sun.collector.service.device.ReceiptMeterService;
import com.sun.collector.utils.FrameUtils;

/**
 * 
 * @ClassName: RemoteCtrl
 * @Description: 远程控制入口-添加命令到队列中
 * @author XS guo
 * @date 2017年8月8日 下午7:08:46
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */

@Service("remoteCtrl")
public class RemoteCtrl {

  private static final Logger logger = LoggerFactory.getLogger(RemoteCtrl.class);

  @Autowired
  private ReceiptDeviceService receiptDeviceService;

  @Autowired
  private ReceiptMeterService receiptMeterService;

  @Autowired
  private ReceiptCollectorService receiptCollectorService;

  DtuContext dtuContext;

  /**
   * 
   * @Title: addCmdCommand @Description: 添加远程控制命令到对应的DTUContext下 @return void @throws
   */
  public void addCmdCommand(CommandRequest request) {
    if (null == request || null == request.getDeviceId()
        || StringUtil.isNullOrEmpty(request.getType())) {
      return;
    }
    ReceiptDevice device = receiptDeviceService.findById(request.getDeviceId());
    if (null == device) {
      return;
    }

    ReceiptMeter meter = receiptMeterService.findById(device.getMeterId());
    ReceiptCollector collector = receiptCollectorService.findById(meter.getCollectorId());

    // 获取当前 DtuContext
    DtuContext dtuContext = DtuContextMap.getInstance().get(collector.getCollectorNo());

    if (dtuContext == null || dtuContext.getDeviceCHC() == null
        || !dtuContext.getDeviceCHC().channel().isActive()) {
      logger.warn("当前操作设备通道故障，请稍后再试！");
      return;
    }

    byte[] writeFrame = null;
    switch (meter.getProtocolType()) {
      case "MATIS_DEVICE":
        writeFrame = NHB_DEVICE_CTRL.writeBrakeFrame(Integer.parseInt(meter.getMeterNo()),
            request.getType());
        break;
    }
    dtuContext.getDeviceCHC().writeAndFlush(writeFrame);
    logger.warn("服务器下发控制命令：" + FrameUtils.toHexString(writeFrame));
  }

  /**
   * getRealTimeData: 读实时数据
   * 
   * @author sunlei 
   * @param request 
   * @since JDK 1.8
   */
  public void getRealTimeData(CommandRequest request) {
    if (null == request || null == request.getDeviceId()) {
      return;
    }
    ReceiptDevice device = receiptDeviceService.findById(request.getDeviceId());
    if (null == device) {
      return;
    }

    ReceiptMeter meter = receiptMeterService.findById(device.getMeterId());
    ReceiptCollector collector = receiptCollectorService.findById(meter.getCollectorId());

    // 获取当前 DtuContext
    DtuContext dtuContext = DtuContextMap.getInstance().get(collector.getCollectorNo());

    if (dtuContext == null || dtuContext.getDeviceCHC() == null
        || !dtuContext.getDeviceCHC().channel().isActive()) {
      return;
    }

    byte[] writeFrame = null;
    switch (meter.getProtocolType()) {
      case "MATIS_DEVICE":
        writeFrame = NHB_DEVICE_CTRL.buildRealTimeDataFrame(Integer.parseInt(meter.getMeterNo()));
        break;
    }
    dtuContext.getDeviceCHC().writeAndFlush(writeFrame);
    logger.warn("服务器下发读实时数据命令：" + FrameUtils.toString(writeFrame));
  }

}
