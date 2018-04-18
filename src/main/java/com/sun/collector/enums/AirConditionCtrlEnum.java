package com.sun.collector.enums;

/**
 * 
 * @ClassName: AirConditionCtrlEnum
 * @Description 空调控制器 枚举
 * @author XS guo
 * @date 2017年7月19日 下午2:12:00
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum AirConditionCtrlEnum {

	AIRCONSWITCH("AIRCONSWITCH", "开关状态"), SWITCHON("SWITCHON", "开机"), SWITCHOFF("SWITCHOFF", "关机"), AIRPARAM("AIRPARAM",
			"量化参数");

	private String key;
	private String value;

	private AirConditionCtrlEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
