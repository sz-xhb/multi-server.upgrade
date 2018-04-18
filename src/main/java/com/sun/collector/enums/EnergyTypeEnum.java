package com.sun.collector.enums;

import com.nhb.utils.nhb_utils.common.StringUtil;

public enum EnergyTypeEnum {

	ELECTRICITY("01", "电(electricity)"), WATER("02", "水(water)"), GAS("03", "气(gas)"), HOT("04", "集中供热量(hot)"), COOL(
			"05", "集中供冷量(cool)"), OTHER("06", "其他能源"), COAL("07", "煤"), LPG("08", "液化石油气"), MFGAS("09",
					"人工煤气"), GASOLINE("10", "汽油"), KEROSENE("11", "煤油"), DERV("12", "柴油"), REABLEENERGY("13", "可再生能源");

	String key;
	String value;

	private EnergyTypeEnum(String key, String value) {
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
			for (EnergyTypeEnum e : EnergyTypeEnum.values()) {
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
			for (EnergyTypeEnum e : EnergyTypeEnum.values()) {
				if (e.getValue().equals(value)) {
					return e.getKey();
				}
			}
		}
		return null;
	}
}
