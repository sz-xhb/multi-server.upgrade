package com.sun.collector.attribute;

import com.sun.collector.base.Device;

import io.netty.channel.ChannelHandlerContext;

/**
 * 
 * @ClassName: DtuContext
 * @Function: DTU属性上下文
 * @date: May 22, 2017 11:29:15 AM
 * @author sunlei
 * @version
 * @since JDK 1.8
 */
public class DtuContext {

	// 设备编号
	private String deviceNo;

	private ChannelHandlerContext deviceCHC;

	private ChannelHandlerContext cmdCHC;

	private Device cmdQueue;

	private Device currentDevice;

	private long lastTime;

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public ChannelHandlerContext getDeviceCHC() {
		return deviceCHC;
	}

	public void setDeviceCHC(ChannelHandlerContext deviceCHC) {
		this.deviceCHC = deviceCHC;
	}

	public ChannelHandlerContext getCmdCHC() {
		return cmdCHC;
	}

	public void setCmdCHC(ChannelHandlerContext cmdCHC) {
		this.cmdCHC = cmdCHC;
	}

	public Device getCmdQueue() {
		return cmdQueue;
	}

	public void setCmdQueue(Device cmdQueue) {
		this.cmdQueue = cmdQueue;
	}

	public Device getCurrentDevice() {
		return currentDevice;
	}

	public void setCurrentDevice(Device currentDevice) {
		this.currentDevice = currentDevice;
	}

	public long getLastTime() {
		return lastTime;
	}

	public void setLastTime(long lastTime) {
		this.lastTime = lastTime;
	}

}
