package com.sun.collector.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;

public abstract class FrameUtils extends ArrayUtils {

	public static String getDeviceNo(byte[] frame) {
		if (frame == null || frame.length < 10) {
			return null;
		}
		StringBuilder deviceNo = new StringBuilder();
		for (int i = 2; i < 10; i++) {
			String hex = Integer.toHexString(frame[i] & 0xFF);
			if (hex.length() == 1) {
				deviceNo.append('0');
			}
			deviceNo.append(hex);
		}
		return deviceNo.toString().toUpperCase();
	}

	public static double floatIeeeConvert(int[] data, int index) {
		int s = 1;
		if ((data[index] & 0x80) == 0x80) {
			s = -1;
		}
		int e = ((data[index] & 0x7f) << 1) + ((data[index + 1] & 0x80) >> 7);
		double m = 0;
		if (e == 0) {
			e = 1 - e;
			m = ((data[index + 1] & 0x7f) * 256 * 256 + data[index + 2] * 256 + data[index + 3]) * 1.0 / (2 << 22);
		} else {
			e = e - 127;
			m = (((data[index + 1] & 0x7f) + 0x80) * 256 * 256 + data[index + 2] * 256 + data[index + 3]) * 1.0
					/ (2 << 22);
		}
		double n = s * Math.pow(2, e) * m;
		BigDecimal b = new BigDecimal(n);
		n = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return n;
	}

	public static String toString(byte[] frame) {
		if (frame == null) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		builder.append('[');
		for (int i = 0; i < frame.length; i++) {
			if (i != 0) {
				builder.append(' ');
			}
			String hex = Integer.toHexString(frame[i] & 0xFF);
			if (hex.length() == 1) {
				builder.append('0');
			}
			builder.append(hex);
		}
		builder.append(']');
		return builder.toString();
	}

	// 07协议BCD码转整数
	public static int toBCDCode07(int[] arr) {
		String ret = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < 10) {
				ret += "0";
			}
			ret += Integer.toHexString(arr[i]);
		}
		return Integer.parseInt(ret);
	}

	public static String toHexString(byte[] frame) {
		if (frame == null) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < frame.length; i++) {
			String hex = Integer.toHexString(frame[i] & 0xFF);
			if (hex.length() == 1) {
				builder.append('0');
			}
			builder.append(hex);
		}
		return builder.toString();
	}

	public static String getCollectorNo(byte[] msg) {
		if (msg == null || msg.length < 6) {
			return null;
		}
		StringBuilder collector = new StringBuilder();
		int length = (msg[3] & 0xFF) * 256 + (msg[4] & 0xFF);
		for (int i = 0; i < length; i++) {
			String hex = Integer.toHexString(msg[5 + i] & 0xFF);
			if (hex.length() == 1) {
				collector.append('0');
			}
			collector.append(hex);
		}
		return collector.toString().toUpperCase();
	}

	// 获取采集器加的编号地址
	public static String getMeterPlusAddr(byte[] msg) throws UnsupportedEncodingException {
		if (msg == null || msg.length < 5) {
			return null;
		}
		int length = msg[4] & 0xff;
		byte[] buf = new byte[length];
		System.arraycopy(msg, 5, buf, 0, length);
		String ret = new String(buf, "utf-8");
		return ret;
	}

	// 在xml字符串中的节点信息
	public static String getNodeInfo(String xmlData, String nodeName) {
		String regex = "<" + nodeName + ">(.*?)</" + nodeName + ">";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(xmlData);
		if (matcher.find()) {
			return matcher.group(0).split("<")[1].split(">")[1];
		}
		return null;
	}
}
