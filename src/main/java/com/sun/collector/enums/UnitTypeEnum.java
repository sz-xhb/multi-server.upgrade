package com.sun.collector.enums;

import com.nhb.utils.nhb_utils.common.StringUtil;

public enum UnitTypeEnum {

	U001("U001", "千瓦时(电)"), U002("U002", "立方米(水)"), U003("U003", "立方米(煤气)"), U004("U004", "千瓦时(电)/平方米"), U005("U005",
			"立方米(水)/平方米"), U006("U006", "立方米(煤气)/平方米"), U007("U007", "千瓦(电)"), U008("U008", "n"), U009("U009",
					"分钟"), U010("U010", "GJ/h"), U011("U011", "GJ"), U012("U012", "摄氏度"), U013("U013",
							"立方米/秒"), U014("U014", "升/分钟"), U015("U015", "吨/小时"), U016("U016", "立方米/小时"), U017("U017",
									"分钟"), U018("U018", "升"), U019("U019", "千克"), U020("U020", "吨"), U021("U021",
											"立方米（柴油）"), U022("U022", "冷量MJ  流量 M3"), U000("U000", "无");

	String key;
	String value;

	private UnitTypeEnum(String key, String value) {
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
			for (UnitTypeEnum e : UnitTypeEnum.values()) {
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
			for (UnitTypeEnum e : UnitTypeEnum.values()) {
				if (e.getValue().equals(value)) {
					return e.getKey();
				}
			}
		}
		return null;
	}

}
