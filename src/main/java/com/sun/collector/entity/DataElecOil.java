package com.sun.collector.entity;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "data_elec_oil")
public class DataElecOil {

	@Id
	@Field("data_id")
	private UUID dataId;

	@Field("kwh_total")
	private double kwhTotal;
	@Field("kwh_for")
	private double kwhFor;
	@Field("kwh_rev")
	private double kwhRev;
	@Field("kvarh1")
	private double kvarh1;
	@Field("kvarh2")
	private double kvarh2;
	@Field("switch_type")
	private String switchType;
	@Field("switch_time_1")
	private Date switchTime1;
	@Field("switch_type_1")
	private String switchType1;
	@Field("oil_kwh_total_1")
	private double oilKwhTotal1;
	@Field("elec_kwh_total_1")
	private double elecKwhTotal1;
	@Field("switch_time_2")
	private Date switchTime2;
	@Field("switch_type_2")
	private String switchType2;
	@Field("oil_kwh_total_2")
	private double oilKwhTotal2;
	@Field("elec_kwh_total_2")
	private double elecKwhTotal2;
	@Field("switch_time_3")
	private Date switchTime3;
	@Field("switch_type_3")
	private String switchType3;
	@Field("oil_kwh_total_3")
	private double oilKwhTotal3;
	@Field("elec_kwh_total_3")
	private double elecKwhTotal3;
	@Field("switch_time_4")
	private Date switchTime4;
	@Field("switch_type_4")
	private String switchType4;
	@Field("oil_kwh_total_4")
	private double oilKwhTotal4;
	@Field("elec_kwh_total_4")
	private double elecKwhTotal4;
	@Field("switch_time_5")
	private Date switchTime5;
	@Field("switch_type_5")
	private String switchType5;
	@Field("oil_kwh_total_5")
	private double oilKwhTotal5;
	@Field("elec_kwh_total_5")
	private double elecKwhTotal5;

	public UUID getDataId() {
		return dataId;
	}

	public void setDataId(UUID dataId) {
		this.dataId = dataId;
	}

	public double getKwhTotal() {
		return kwhTotal;
	}

	public void setKwhTotal(double kwhTotal) {
		this.kwhTotal = kwhTotal;
	}

	public double getKwhFor() {
		return kwhFor;
	}

	public void setKwhFor(double kwhFor) {
		this.kwhFor = kwhFor;
	}

	public double getKwhRev() {
		return kwhRev;
	}

	public void setKwhRev(double kwhRev) {
		this.kwhRev = kwhRev;
	}

	public double getKvarh1() {
		return kvarh1;
	}

	public void setKvarh1(double kvarh1) {
		this.kvarh1 = kvarh1;
	}

	public double getKvarh2() {
		return kvarh2;
	}

	public void setKvarh2(double kvarh2) {
		this.kvarh2 = kvarh2;
	}

	public double getOilKwhTotal1() {
		return oilKwhTotal1;
	}

	public void setOilKwhTotal1(double oilKwhTotal1) {
		this.oilKwhTotal1 = oilKwhTotal1;
	}

	public double getElecKwhTotal1() {
		return elecKwhTotal1;
	}

	public void setElecKwhTotal1(double elecKwhTotal1) {
		this.elecKwhTotal1 = elecKwhTotal1;
	}

	public double getOilKwhTotal2() {
		return oilKwhTotal2;
	}

	public void setOilKwhTotal2(double oilKwhTotal2) {
		this.oilKwhTotal2 = oilKwhTotal2;
	}

	public double getElecKwhTotal2() {
		return elecKwhTotal2;
	}

	public void setElecKwhTotal2(double elecKwhTotal2) {
		this.elecKwhTotal2 = elecKwhTotal2;
	}

	public double getOilKwhTotal3() {
		return oilKwhTotal3;
	}

	public void setOilKwhTotal3(double oilKwhTotal3) {
		this.oilKwhTotal3 = oilKwhTotal3;
	}

	public double getElecKwhTotal3() {
		return elecKwhTotal3;
	}

	public void setElecKwhTotal3(double elecKwhTotal3) {
		this.elecKwhTotal3 = elecKwhTotal3;
	}

	public double getOilKwhTotal4() {
		return oilKwhTotal4;
	}

	public void setOilKwhTotal4(double oilKwhTotal4) {
		this.oilKwhTotal4 = oilKwhTotal4;
	}

	public double getElecKwhTotal4() {
		return elecKwhTotal4;
	}

	public void setElecKwhTotal4(double elecKwhTotal4) {
		this.elecKwhTotal4 = elecKwhTotal4;
	}

	public double getOilKwhTotal5() {
		return oilKwhTotal5;
	}

	public void setOilKwhTotal5(double oilKwhTotal5) {
		this.oilKwhTotal5 = oilKwhTotal5;
	}

	public double getElecKwhTotal5() {
		return elecKwhTotal5;
	}

	public void setElecKwhTotal5(double elecKwhTotal5) {
		this.elecKwhTotal5 = elecKwhTotal5;
	}

	public Date getSwitchTime1() {
		return switchTime1;
	}

	public void setSwitchTime1(Date switchTime1) {
		this.switchTime1 = switchTime1;
	}

	public Date getSwitchTime2() {
		return switchTime2;
	}

	public void setSwitchTime2(Date switchTime2) {
		this.switchTime2 = switchTime2;
	}

	public Date getSwitchTime3() {
		return switchTime3;
	}

	public void setSwitchTime3(Date switchTime3) {
		this.switchTime3 = switchTime3;
	}

	public Date getSwitchTime4() {
		return switchTime4;
	}

	public void setSwitchTime4(Date switchTime4) {
		this.switchTime4 = switchTime4;
	}

	public Date getSwitchTime5() {
		return switchTime5;
	}

	public void setSwitchTime5(Date switchTime5) {
		this.switchTime5 = switchTime5;
	}

	public String getSwitchType1() {
		return switchType1;
	}

	public void setSwitchType1(String switchType1) {
		this.switchType1 = switchType1;
	}

	public String getSwitchType2() {
		return switchType2;
	}

	public void setSwitchType2(String switchType2) {
		this.switchType2 = switchType2;
	}

	public String getSwitchType3() {
		return switchType3;
	}

	public void setSwitchType3(String switchType3) {
		this.switchType3 = switchType3;
	}

	public String getSwitchType4() {
		return switchType4;
	}

	public void setSwitchType4(String switchType4) {
		this.switchType4 = switchType4;
	}

	public String getSwitchType5() {
		return switchType5;
	}

	public void setSwitchType5(String switchType5) {
		this.switchType5 = switchType5;
	}

	public String getSwitchType() {
		return switchType;
	}

	public void setSwitchType(String switchType) {
		this.switchType = switchType;
	}

}
