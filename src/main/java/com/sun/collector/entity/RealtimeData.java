package com.sun.collector.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "realtime_data")
public class RealtimeData {

	@Id
	@Field("device_id")
	private String deviceId;

	@Field("meter_time")
	private Date meterTime;

	@Field("service_id")
	private String serviceId;

	@Field("data")
	private Object data;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}


	public Date getMeterTime() {
    return meterTime;
  }

  public void setMeterTime(Date meterTime) {
    this.meterTime = meterTime;
  }

  public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
