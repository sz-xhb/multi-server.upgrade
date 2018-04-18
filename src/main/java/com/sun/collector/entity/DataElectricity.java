package com.sun.collector.entity;

/**
 * The persistent class for the data_electricity database table.
 * 
 */
public class DataElectricity {

  private String meterTime;
  
  private Double ibb;
  // 过压电压
  private Double hVolt;
  // 欠压电压
  private Double lVolt;

  private Double volt;

  private Double aVolt;

  private Double voltageAB;

  private Double bVolt;

  private Double voltageBC;

  private Double cVolt;

  private Double voltageCA;

  private Double current;

  private Double aCurrent;

  private Double bCurrent;

  private Double cCurrent;

  private Double frequency;

  private Double kw;

  private Double aKw;

  private Double bKw;

  private Double cKw;

  private Double kvar;

  private Double aKvar;

  private Double bKvar;

  private Double cKvar;

  private Double powerFactor;

  private Double kwh;

  private Double aKwh;

  private Double bKwh;

  private Double cKwh;

  private Double kva;

  private Double kvaA;

  private Double kvaB;

  private Double kvaC;

  private Double kvarh1;

  private Double kvarh2;

  private Double kwhForward;

  private Double kwhReverse;

  private Double powerFactorA;

  private Double powerFactorB;

  private Double powerFactorC;

  public DataElectricity() {}


  public String getMeterTime() {
    return meterTime;
  }


  public void setMeterTime(String meterTime) {
    this.meterTime = meterTime == null ? "" : meterTime;
  }


  public Double getIbb() {
    return ibb;
  }

  public Double gethVolt() {
    return hVolt;
  }

  public Double getlVolt() {
    return lVolt;
  }

  public Double getVolt() {
    return volt;
  }

  public Double getaVolt() {
    return aVolt;
  }

  public Double getVoltageAB() {
    return voltageAB;
  }

  public Double getbVolt() {
    return bVolt;
  }

  public Double getVoltageBC() {
    return voltageBC;
  }

  public Double getcVolt() {
    return cVolt;
  }

  public Double getVoltageCA() {
    return voltageCA;
  }

  public Double getCurrent() {
    return current;
  }

  public Double getaCurrent() {
    return aCurrent;
  }

  public Double getbCurrent() {
    return bCurrent;
  }

  public Double getcCurrent() {
    return cCurrent;
  }

  public Double getFrequency() {
    return frequency;
  }

  public Double getKw() {
    return kw;
  }

  public Double getaKw() {
    return aKw;
  }

  public Double getbKw() {
    return bKw;
  }

  public Double getcKw() {
    return cKw;
  }

  public Double getKvar() {
    return kvar;
  }

  public Double getaKvar() {
    return aKvar;
  }

  public Double getbKvar() {
    return bKvar;
  }

  public Double getcKvar() {
    return cKvar;
  }

  public Double getPowerFactor() {
    return powerFactor;
  }

  public Double getKwh() {
    return kwh;
  }

  public Double getaKwh() {
    return aKwh;
  }

  public Double getbKwh() {
    return bKwh;
  }

  public Double getcKwh() {
    return cKwh;
  }

  public Double getKva() {
    return kva;
  }

  public Double getKvaA() {
    return kvaA;
  }

  public Double getKvaB() {
    return kvaB;
  }

  public Double getKvaC() {
    return kvaC;
  }

  public Double getKvarh1() {
    return kvarh1;
  }

  public Double getKvarh2() {
    return kvarh2;
  }

  public Double getKwhForward() {
    return kwhForward;
  }

  public Double getKwhReverse() {
    return kwhReverse;
  }

  public Double getPowerFactorA() {
    return powerFactorA;
  }

  public Double getPowerFactorB() {
    return powerFactorB;
  }

  public Double getPowerFactorC() {
    return powerFactorC;
  }

  public void setIbb(Double ibb) {
    this.ibb = ibb;
  }

  public void sethVolt(Double hVolt) {
    this.hVolt = hVolt;
  }

  public void setlVolt(Double lVolt) {
    this.lVolt = lVolt;
  }

  public void setVolt(Double volt) {
    this.volt = volt;
  }

  public void setaVolt(Double aVolt) {
    this.aVolt = aVolt;
  }

  public void setVoltageAB(Double voltageAB) {
    this.voltageAB = voltageAB;
  }

  public void setbVolt(Double bVolt) {
    this.bVolt = bVolt;
  }

  public void setVoltageBC(Double voltageBC) {
    this.voltageBC = voltageBC;
  }

  public void setcVolt(Double cVolt) {
    this.cVolt = cVolt;
  }

  public void setVoltageCA(Double voltageCA) {
    this.voltageCA = voltageCA;
  }

  public void setCurrent(Double current) {
    this.current = current;
  }

  public void setaCurrent(Double aCurrent) {
    this.aCurrent = aCurrent;
  }

  public void setbCurrent(Double bCurrent) {
    this.bCurrent = bCurrent;
  }

  public void setcCurrent(Double cCurrent) {
    this.cCurrent = cCurrent;
  }

  public void setFrequency(Double frequency) {
    this.frequency = frequency;
  }

  public void setKw(Double kw) {
    this.kw = kw;
  }

  public void setaKw(Double aKw) {
    this.aKw = aKw;
  }

  public void setbKw(Double bKw) {
    this.bKw = bKw;
  }

  public void setcKw(Double cKw) {
    this.cKw = cKw;
  }

  public void setKvar(Double kvar) {
    this.kvar = kvar;
  }

  public void setaKvar(Double aKvar) {
    this.aKvar = aKvar;
  }

  public void setbKvar(Double bKvar) {
    this.bKvar = bKvar;
  }

  public void setcKvar(Double cKvar) {
    this.cKvar = cKvar;
  }

  public void setPowerFactor(Double powerFactor) {
    this.powerFactor = powerFactor;
  }

  public void setKwh(Double kwh) {
    this.kwh = kwh;
  }

  public void setaKwh(Double aKwh) {
    this.aKwh = aKwh;
  }

  public void setbKwh(Double bKwh) {
    this.bKwh = bKwh;
  }

  public void setcKwh(Double cKwh) {
    this.cKwh = cKwh;
  }

  public void setKva(Double kva) {
    this.kva = kva;
  }

  public void setKvaA(Double kvaA) {
    this.kvaA = kvaA;
  }

  public void setKvaB(Double kvaB) {
    this.kvaB = kvaB;
  }

  public void setKvaC(Double kvaC) {
    this.kvaC = kvaC;
  }

  public void setKvarh1(Double kvarh1) {
    this.kvarh1 = kvarh1;
  }

  public void setKvarh2(Double kvarh2) {
    this.kvarh2 = kvarh2;
  }

  public void setKwhForward(Double kwhForward) {
    this.kwhForward = kwhForward;
  }

  public void setKwhReverse(Double kwhReverse) {
    this.kwhReverse = kwhReverse;
  }

  public void setPowerFactorA(Double powerFactorA) {
    this.powerFactorA = powerFactorA;
  }

  public void setPowerFactorB(Double powerFactorB) {
    this.powerFactorB = powerFactorB;
  }

  public void setPowerFactorC(Double powerFactorC) {
    this.powerFactorC = powerFactorC;
  }

}
