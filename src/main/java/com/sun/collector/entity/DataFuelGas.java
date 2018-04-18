package com.sun.collector.entity;
/**
 * 
* @ClassName: DataFuelGas
* @Description: TODO(这里用一句话描述这个类的作用)
* @author XS guo
* @date 2017年8月7日 下午2:47:41
* @see [相关类/方法]（可选）
* @since [产品/模块版本] （可选）
 */

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "data_fuel_gas")
public class DataFuelGas {

	@Id
	private UUID id;

	@Field("read_time")
	private Date readTime;

	@Field("consumption")
	private Double consumption;

	@Field("device_id")
	private String deviceId;

	@Field("statue")
	private String status;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Date getReadTime() {
		return readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}

	public Double getConsumption() {
		return consumption;
	}

	public void setConsumption(Double consumption) {
		this.consumption = consumption;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
