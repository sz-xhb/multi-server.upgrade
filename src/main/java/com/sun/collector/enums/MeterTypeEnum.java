package com.sun.collector.enums;

import com.nhb.utils.nhb_utils.common.StringUtil;

public enum MeterTypeEnum {

	Modbus_DTELECTRICITYSY("ELECTRICITY", "电"), TEMPERATURE("TEMPERATURE", "温度"), SWITCH("SWITCH", "开关"), WATER("WATER",
			"水"), STEAM("STEAM", "气"), OIL_MARKET("OIL_MARKET", "市电油机"), HARMNIC("HARMNIC", "谐波"), RATE("RATE", "费率");

	String key;
	String value;

	private MeterTypeEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	/**
	 * @Title: getValueByKey
	 * @Description: (根据key获取value)
	 * @return String
	 * @throws @author
	 *             XS guo
	 * @date 2016-3-31 下午4:46:32
	 */
	public static String getValueByKey(String key) {
		if (!StringUtil.isNullOrEmpty(key)) {
			for (MeterTypeEnum e : MeterTypeEnum.values()) {
				if (e.getKey().equals(key)) {
					return e.getValue();
				}
			}
		}
		return null;
	}

	/**
	 * @Title: getKeyByValue
	 * @Description: (根据value获取key)
	 * @return String
	 * @throws @author
	 *             XS guo
	 * @date 2016-4-1 上午10:32:59
	 */
	public static String getKeyByValue(String value) {
		if (!StringUtil.isNullOrEmpty(value)) {
			for (MeterTypeEnum e : MeterTypeEnum.values()) {
				if (e.getValue().equals(value)) {
					return e.getKey();
				}
			}
		}
		return null;
	}

}
