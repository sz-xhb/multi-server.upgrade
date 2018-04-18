package com.sun.collector.enums;

import com.nhb.utils.nhb_utils.common.StringUtil;

/**
 * @ClassName: ProtrocolTypeEnum
 * @Description: 协议类型枚举
 * @author XS guo
 * @date 2017年2月20日 上午10:41:58
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum ProtrocolTypeEnum {

	// 交流智能电表
	AC_JLMK("AC_JLMK", "交流智能电表"),
	// 直流六路表
	DC_JLMK("DC_JLMK", "直流六路表"),
	// 空调控制器
	AIR_CTRL("AIR_CTRL", "空调控制器"),
	// 188协议水表
	CJ188_WATER("CJ188_WATER", "188协议水表"),
	// 188 协议燃气表
	CJ188_GAS("CJ188_GAS", "188协议燃气表"),
	// 188 协议热量表
	CJ188_CALORIMETER("CJ188_CALORIMETER", "188协议热量表"),
	// 三相预付费导轨表
	MODBUS_DTSY("MODBUS_DTSY", "预付费电表"),
	// 智能电操（旧）
	RECLOSER("RECLOSER", "智能电操"),
	// 智能电操（新）
	RECLOSER_NEW("RECLOSER_NEW", "智能电操（新）"),
	// 07 协议
	DLT645_2007("DLT645_2007", "07协议"),
	// 三相单路表 全功能协议
	NHB_M1V02_3("NHB_M1V02_3", "三相单路表"),
	// 三相四路表 正常
	NHB_M4V02_4_1("NHB_M4V02_4_1", "三相四路表"),
	// 三相四路表 做 单相 12表 使用
	NHB_M4V02_0("NHB_M4V02_0", "12路单相表");

	String key;
	String value;

	private ProtrocolTypeEnum(String key, String value) {
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
			for (ProtrocolTypeEnum e : ProtrocolTypeEnum.values()) {
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
			for (ProtrocolTypeEnum e : ProtrocolTypeEnum.values()) {
				if (e.getValue().equals(value)) {
					return e.getKey();
				}
			}
		}
		return null;
	}

}
