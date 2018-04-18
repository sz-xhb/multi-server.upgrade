package com.sun.collector.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.collector.entity.ReceiptCollector;
import com.sun.collector.entity.ReceiptDevice;
import com.sun.collector.entity.ReceiptMeter;
import com.sun.collector.utils.FrameUtils;

public abstract class AbstractDevice implements Device {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected ReceiptCollector receiptCollector;
	protected ReceiptMeter receiptMeter;
	protected ReceiptDevice receiptDevice;

	protected byte[] readingFrames = null;
	protected byte[] writingFrames = null;

	@Override
	public void processReadingFrame(byte[] readingFrame) {
		// 先判断设备号是否一致
		if (!isPacketBelongToDevice(readingFrame)) {
			return;
		}
		// 长度 小于 包头包尾长度 9，不需要解析
		if (readingFrame.length < 12) {
			return;
		}
		// 去除 包头 包尾 和 188 协议设备 前缀 fe
		int counter = 0;
		// 先去包头包尾
		byte[] data = new byte[readingFrame.length - 12];
		for (int i = 0; i < data.length; i++) {
			data[i] = readingFrame[i + 10];
		}
		// 判断 开头fe的 字符全部去掉
		for (int i = 0; i < data.length; i++) {
			int fe = data[i] & 0xff;
			if (fe == 0xfe) {
				counter++;
			} else { // 当不是fe 后直接跳过
				break;
			}
		}
		// 新的数组
		byte[] destFrame = new byte[data.length - counter];
		System.arraycopy(data, counter, destFrame, 0, destFrame.length);

		try {
			readingFrames = destFrame;
			if (!analyzeFrame(readingFrames)) {
				return;
			}
			handleResult();
		} catch (Exception ex) {
			logger.error("unknow Exception", ex);
		}
	}

	/**
	 * Do the receive packet belong to current Meter ?
	 * 
	 * @param msg
	 *            receive packet
	 * @return Yes retrun true,No return false
	 */
	private boolean isPacketBelongToDevice(byte[] msg) {
		try {
			String deviceNo;
			deviceNo = doGetDeviceNo(msg);
			if (deviceNo.equals(receiptCollector.getCollectorNo())) {
				return true;
			}
		} catch (Exception ex) {
			logger.error("Exception in isPacketBelongToDevice：", ex);
		}
		return false;
	}

	/**
	 * Get Device Address
	 * 
	 * @param msg
	 *            receive packet
	 * @return meterNO
	 */
	private String doGetDeviceNo(byte[] msg) throws Exception {
		// 解析deivceNO
		return FrameUtils.getDeviceNo(msg);
	}

	// 获取下发帧
	@Override
	public byte[] getWritingFrame() {
		return writingFrames;
	}

	public abstract void buildWritingFrames();

	public abstract boolean analyzeFrame(byte[] frame);

	public abstract void handleResult();

}
