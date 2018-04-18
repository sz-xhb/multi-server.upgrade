package com.sun.collector.enums;

public enum AlarmTypeEnum {

	OVERVOLTAGE_A("OVERVOLTAGE_A", "A相过压"),OVERVOLTAGE_B("OVERVOLTAGE_A", "B相过压"),OVERVOLTAGE_C("OVERVOLTAGE_C", "C相过压"),
	UNDERVOLTAGE_A("UNDERVOLTAGE_A", "A相欠压"),UNDERVOLTAGE_B("UNDERVOLTAGE_B", "B相欠压"),UNDERVOLTAGE_C("UNDERVOLTAGE_C", "C相欠压"),
	SHORTCIRCUIT_A("SHORTCIRCUIT_A", "A相短路"),SHORTCIRCUIT_B("SHORTCIRCUIT_B", "B相短路"),SHORTCIRCUIT_C("SHORTCIRCUIT_C", "C相短路"),
	OVERCURRENT_A("OVERCURRENT_A", "A相过流"),OVERCURRENT_B("OVERCURRENT_B", "B相过流"),OVERCURRENT_C("OVERCURRENT_C", "C相过流"),
	PHASELOSS_A("PHASELOSS_A", "A相断相"),PHASELOSS_B("PHASELOSS_B", "B相断相"),PHASELOSS_C("PHASELOSS_C", "C相断相");

	String key;
	String value;

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

	private AlarmTypeEnum(String key, String value) {
		this.key = key;
		this.value = value;

	}

}
