package com.sun.collector.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "air_ctrl_comm")
public class AirCtrlComm {

	@Id
	@Field("circuit_id")
	private String circuitId;

	@Field("read_time")
	private Date readTime;

	@Field("status")
	private String status;
	// 制冷状态异常告警
	@Field("refrigeration_ex")
	private String refrigerationEx;
	// 制热状态异常告警
	@Field("heating_ex")
	private String heatingEx;
	// 电源告警
	@Field("power_ex")
	private String powerEx;
	// 电流传感器故障
	@Field("currsensor_ex")
	private String currsensorEx;
	// 回风温度传感器故障
	@Field("returnair_ex")
	private String returnairEx;
	// 出风温度传感器故障
	@Field("deliveryair_ex")
	private String deliveryairEx;
	// A相电压
	@Field("power_a")
	private Integer powerA;
	// A相电流
	@Field("current_a")
	private Double currentA;
	// A相电压
	@Field("power_b")
	private Integer powerB;
	// A相电流
	@Field("current_b")
	private Double currentB;
	// A相电压
	@Field("power_c")
	private Integer powerC;
	// A相电流
	@Field("current_c")
	private Double currentC;
	// 送风温度
	@Field("supply_temp")
	private Integer supplyTemp;
	// 回风温度
	@Field("return_temp")
	private Integer returnTemp;

	public String getCircuitId() {
		return circuitId;
	}

	public void setCircuitId(String circuitId) {
		this.circuitId = circuitId;
	}

	public Date getReadTime() {
		return readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRefrigerationEx() {
		return refrigerationEx;
	}

	public void setRefrigerationEx(String refrigerationEx) {
		this.refrigerationEx = refrigerationEx;
	}

	public String getHeatingEx() {
		return heatingEx;
	}

	public void setHeatingEx(String heatingEx) {
		this.heatingEx = heatingEx;
	}

	public String getPowerEx() {
		return powerEx;
	}

	public void setPowerEx(String powerEx) {
		this.powerEx = powerEx;
	}

	public String getCurrsensorEx() {
		return currsensorEx;
	}

	public void setCurrsensorEx(String currsensorEx) {
		this.currsensorEx = currsensorEx;
	}

	public String getReturnairEx() {
		return returnairEx;
	}

	public void setReturnairEx(String returnairEx) {
		this.returnairEx = returnairEx;
	}

	public String getDeliveryairEx() {
		return deliveryairEx;
	}

	public void setDeliveryairEx(String deliveryairEx) {
		this.deliveryairEx = deliveryairEx;
	}

	public Integer getPowerA() {
		return powerA;
	}

	public void setPowerA(Integer powerA) {
		this.powerA = powerA;
	}

	public Double getCurrentA() {
		return currentA;
	}

	public void setCurrentA(Double currentA) {
		this.currentA = currentA;
	}

	public Integer getPowerB() {
		return powerB;
	}

	public void setPowerB(Integer powerB) {
		this.powerB = powerB;
	}

	public Double getCurrentB() {
		return currentB;
	}

	public void setCurrentB(Double currentB) {
		this.currentB = currentB;
	}

	public Integer getPowerC() {
		return powerC;
	}

	public void setPowerC(Integer powerC) {
		this.powerC = powerC;
	}

	public Double getCurrentC() {
		return currentC;
	}

	public void setCurrentC(Double currentC) {
		this.currentC = currentC;
	}

	public Integer getSupplyTemp() {
		return supplyTemp;
	}

	public void setSupplyTemp(Integer supplyTemp) {
		this.supplyTemp = supplyTemp;
	}

	public Integer getReturnTemp() {
		return returnTemp;
	}

	public void setReturnTemp(Integer returnTemp) {
		this.returnTemp = returnTemp;
	}

}
