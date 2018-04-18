package com.sun.collector.entity;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 
 * @ClassName: DataDtsy
 * @Description: 三相预付费 导轨表 实体
 * @author XS guo
 * @date 2017年7月12日 上午9:03:32
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Document(collection = "data_dtsy")
public class DataDtsy {
	@Id
	@Field("data_id")
	private UUID data_id;
	// 一级报警电量
	@Field("alarm_power_level1")
	private Integer alarmPowerLevel1;
	// 二级报警电量
	@Field("alarm_power_level2")
	private Integer alarmPowerLevel2;
	// 过负荷门限
	@Field("load_threshold")
	private double loadThreshold;
	// 售电次数
	@Field("sell_num")
	private Integer sellNum;
	// 累计电量
	@Field("cumulative_power")
	private double cumulativePower;
	// 剩余电量
	@Field("surplus_power")
	private double surplusPower;
	// 总累计电量
	@Field("total_cumulative_power")
	private double totalCumulativePower;
	// 透支电量
	@Field("overdraw_power")
	private Integer overdrawPower;
	// 囤积电量
	@Field("corner_power")
	private Integer cornerPower;
	// 最近一次购电量
	@Field("last_purchase_power")
	private double lastPurchasePower;
	// 过零电量
	@Field("zero_power")
	private double zeroPower;
	// 非法卡使用次数
	@Field("illegal_times")
	private Integer illegalTimes;
	// 过负荷次数
	@Field("load_threshold_times")
	private Integer loadThresholdTimes;
	// 恶性负载门限
	@Field("malignant_load_threshold")
	private Integer malignantLoadThreshold;
	// 恶性负载次数
	@Field("malignant_load_times")
	private Integer malignantLoadTimes;
	// 电表状态字2
	@Field("status_word2")
	private String statusWord2;
	// 时间
	@Field("read_time")
	private Date readTime;

	public UUID getData_id() {
		return data_id;
	}

	public void setData_id(UUID data_id) {
		this.data_id = data_id;
	}

	public Integer getAlarmPowerLevel1() {
		return alarmPowerLevel1;
	}

	public void setAlarmPowerLevel1(Integer alarmPowerLevel1) {
		this.alarmPowerLevel1 = alarmPowerLevel1;
	}

	public Integer getAlarmPowerLevel2() {
		return alarmPowerLevel2;
	}

	public void setAlarmPowerLevel2(Integer alarmPowerLevel2) {
		this.alarmPowerLevel2 = alarmPowerLevel2;
	}

	public double getLoadThreshold() {
		return loadThreshold;
	}

	public void setLoadThreshold(double loadThreshold) {
		this.loadThreshold = loadThreshold;
	}

	public Integer getSellNum() {
		return sellNum;
	}

	public void setSellNum(Integer sellNum) {
		this.sellNum = sellNum;
	}

	public double getCumulativePower() {
		return cumulativePower;
	}

	public void setCumulativePower(double cumulativePower) {
		this.cumulativePower = cumulativePower;
	}

	public double getSurplusPower() {
		return surplusPower;
	}

	public void setSurplusPower(double surplusPower) {
		this.surplusPower = surplusPower;
	}

	public double getTotalCumulativePower() {
		return totalCumulativePower;
	}

	public void setTotalCumulativePower(double totalCumulativePower) {
		this.totalCumulativePower = totalCumulativePower;
	}

	public Integer getOverdrawPower() {
		return overdrawPower;
	}

	public void setOverdrawPower(Integer overdrawPower) {
		this.overdrawPower = overdrawPower;
	}

	public Integer getCornerPower() {
		return cornerPower;
	}

	public void setCornerPower(Integer cornerPower) {
		this.cornerPower = cornerPower;
	}

	public double getLastPurchasePower() {
		return lastPurchasePower;
	}

	public void setLastPurchasePower(double lastPurchasePower) {
		this.lastPurchasePower = lastPurchasePower;
	}

	public double getZeroPower() {
		return zeroPower;
	}

	public void setZeroPower(double zeroPower) {
		this.zeroPower = zeroPower;
	}

	public Integer getIllegalTimes() {
		return illegalTimes;
	}

	public void setIllegalTimes(Integer illegalTimes) {
		this.illegalTimes = illegalTimes;
	}

	public Integer getLoadThresholdTimes() {
		return loadThresholdTimes;
	}

	public void setLoadThresholdTimes(Integer loadThresholdTimes) {
		this.loadThresholdTimes = loadThresholdTimes;
	}

	public Integer getMalignantLoadThreshold() {
		return malignantLoadThreshold;
	}

	public void setMalignantLoadThreshold(Integer malignantLoadThreshold) {
		this.malignantLoadThreshold = malignantLoadThreshold;
	}

	public Integer getMalignantLoadTimes() {
		return malignantLoadTimes;
	}

	public void setMalignantLoadTimes(Integer malignantLoadTimes) {
		this.malignantLoadTimes = malignantLoadTimes;
	}

	public String getStatusWord2() {
		return statusWord2;
	}

	public void setStatusWord2(String statusWord2) {
		this.statusWord2 = statusWord2;
	}

	public Date getReadTime() {
		return readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}
}
