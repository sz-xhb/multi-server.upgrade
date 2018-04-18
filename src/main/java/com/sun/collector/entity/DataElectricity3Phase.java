package com.sun.collector.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "data_electricity_3phase")
public class DataElectricity3Phase {

	@Id
	@Field("data_id")
	private UUID dataId;

	@Field("kwh")
	private Double kwh;

	@Field("kwhForward")
	private Double kwhForward;

	@Field("kwhReverse")
	private Double kwhReverse;

	@Field("kvarh1")
	private Double kvarh1;

	@Field("kvarh2")
	private Double kvarh2;

	@Field("kwhA")
	private Double kwhA;

	@Field("kwhForwardA")
	private Double kwhForwardA;

	@Field("kwhReverseA")
	private Double kwhReverseA;

	@Field("kvarh1A")
	private Double kvarh1A;

	@Field("kvarh2A")
	private Double kvarh2A;

	@Field("kwhB")
	private Double kwhB;

	@Field("kwhForwardB")
	private Double kwhForwardB;

	@Field("kwhReverseB")
	private Double kwhReverseB;

	@Field("kvarh1B")
	private Double kvarh1B;

	@Field("kvarh2B")
	private Double kvarh2B;

	@Field("kwhC")
	private Double kwhC;

	@Field("kwhForwardC")
	private Double kwhForwardC;

	@Field("kwhReverseC")
	private Double kwhReverseC;

	@Field("kvarh1C")
	private Double kvarh1C;

	@Field("kvarh2C")
	private Double kvarh2C;

	public Double getKwhForward() {
		return kwhForward;
	}

	public void setKwhForward(Double kwhForward) {
		this.kwhForward = kwhForward;
	}

	public Double getKwhReverse() {
		return kwhReverse;
	}

	public void setKwhReverse(Double kwhReverse) {
		this.kwhReverse = kwhReverse;
	}

	public Double getKvarh1() {
		return kvarh1;
	}

	public void setKvarh1(Double kvarh1) {
		this.kvarh1 = kvarh1;
	}

	public Double getKvarh2() {
		return kvarh2;
	}

	public void setKvarh2(Double kvarh2) {
		this.kvarh2 = kvarh2;
	}

	public Double getKwhA() {
		return kwhA;
	}

	public void setKwhA(Double kwhA) {
		this.kwhA = kwhA;
	}

	public Double getKwhForwardA() {
		return kwhForwardA;
	}

	public void setKwhForwardA(Double kwhForwardA) {
		this.kwhForwardA = kwhForwardA;
	}

	public Double getKwhReverseA() {
		return kwhReverseA;
	}

	public void setKwhReverseA(Double kwhReverseA) {
		this.kwhReverseA = kwhReverseA;
	}

	public Double getKvarh1A() {
		return kvarh1A;
	}

	public void setKvarh1A(Double kvarh1a) {
		kvarh1A = kvarh1a;
	}

	public Double getKvarh2A() {
		return kvarh2A;
	}

	public void setKvarh2A(Double kvarh2a) {
		kvarh2A = kvarh2a;
	}

	public Double getKwhB() {
		return kwhB;
	}

	public void setKwhB(Double kwhB) {
		this.kwhB = kwhB;
	}

	public Double getKwhForwardB() {
		return kwhForwardB;
	}

	public void setKwhForwardB(Double kwhForwardB) {
		this.kwhForwardB = kwhForwardB;
	}

	public Double getKwhReverseB() {
		return kwhReverseB;
	}

	public void setKwhReverseB(Double kwhReverseB) {
		this.kwhReverseB = kwhReverseB;
	}

	public Double getKvarh1B() {
		return kvarh1B;
	}

	public void setKvarh1B(Double kvarh1b) {
		kvarh1B = kvarh1b;
	}

	public Double getKvarh2B() {
		return kvarh2B;
	}

	public void setKvarh2B(Double kvarh2b) {
		kvarh2B = kvarh2b;
	}

	public Double getKwhC() {
		return kwhC;
	}

	public void setKwhC(Double kwhC) {
		this.kwhC = kwhC;
	}

	public Double getKwhForwardC() {
		return kwhForwardC;
	}

	public void setKwhForwardC(Double kwhForwardC) {
		this.kwhForwardC = kwhForwardC;
	}

	public Double getKwhReverseC() {
		return kwhReverseC;
	}

	public void setKwhReverseC(Double kwhReverseC) {
		this.kwhReverseC = kwhReverseC;
	}

	public Double getKvarh1C() {
		return kvarh1C;
	}

	public void setKvarh1C(Double kvarh1c) {
		kvarh1C = kvarh1c;
	}

	public Double getKvarh2C() {
		return kvarh2C;
	}

	public void setKvarh2C(Double kvarh2c) {
		kvarh2C = kvarh2c;
	}

	public Double getKwh() {
		return kwh;
	}

	public void setKwh(Double kwh) {
		this.kwh = kwh;
	}

	public UUID getDataId() {
		return dataId;
	}

	public void setDataId(UUID dataId) {
		this.dataId = dataId;
	}

}
