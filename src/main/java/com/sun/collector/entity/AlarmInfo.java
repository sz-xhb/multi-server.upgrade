package com.sun.collector.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "alarm_info")
public class AlarmInfo {

	@Id
	@Field("id")
	private String id;

	@Field("device_id")
	private String deviceId;

	@Field("alarm_type")
	private String alarmType;

	@Field("read_time")
	private Date readTime;

	/**
	 * 处理状态，0-未处理-实时告警，1-已处理-历史告警
	 */
	@Field("deal_status")
	private Integer dealStatus;

	@Field("handle_reason")
	private String handleReason;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public Date getReadTime() {
		return readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}

	public Integer getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(Integer dealStatus) {
		this.dealStatus = dealStatus;
	}

	public String getHandleReason() {
		return handleReason;
	}

	public void setHandleReason(String handleReason) {
		this.handleReason = handleReason;
	}

}
