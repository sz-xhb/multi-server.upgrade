package com.sun.collector.entity;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "data_temperature")
public class DataTemperature {

	@Id
	private UUID id;

	@Field("read_time")
	private Date readTime;

	@Field("device_id")
	private String deviceId;

	@Field("temperature")
	private Double temperature;

	@Field("temperature_a")
	private Double temperatureA;

	@Field("temperature_b")
	private Double temperatureB;

	@Field("temperature_c")
	private Double temperatureC;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Date getReadTime() {
		return this.readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}

	public Double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Double getTemperatureA() {
		return temperatureA;
	}

	public void setTemperatureA(Double temperatureA) {
		this.temperatureA = temperatureA;
	}

	public Double getTemperatureB() {
		return temperatureB;
	}

	public void setTemperatureB(Double temperatureB) {
		this.temperatureB = temperatureB;
	}

	public Double getTemperatureC() {
		return temperatureC;
	}

	public void setTemperatureC(Double temperatureC) {
		this.temperatureC = temperatureC;
	}

}