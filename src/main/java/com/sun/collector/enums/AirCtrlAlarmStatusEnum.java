package com.sun.collector.enums;

/**
 * 
 * @ClassName: AirCtrlAlarmStatusEnum
 * @Description: 空調控制器 告警状态 枚举
 * @author XS guo
 * @date 2017年7月21日 上午9:51:03
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum AirCtrlAlarmStatusEnum {

	NORMAL("NORMAL", "正常"), BELOWLOWER("BELOWLOWER", "低于下限"), HIGHLOWER("HIGHLOWER", "高于下限"), UNDETECTION("UNDETECTION",
			"未检测"), BREAKDOWN("BREAKDOWN", "故障");

	private AirCtrlAlarmStatusEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}

	private String key;

	private String value;

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