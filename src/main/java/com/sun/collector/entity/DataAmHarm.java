//package com.sun.collector.entity;
//
//import java.io.Serializable;
//
//public class DataAmHarm implements Serializable {
//
//	private static final long serialVersionUID = -1736394601823989647L;
//
//	private DataElectricity dataElectricity;
//
//	private Double baseVoltA;
//
//	private Double baseVoltB;
//
//	private Double baseVoltC;
//
//	private Double baseCurrentA;
//
//	private Double baseCurrentB;
//
//	private Double baseCurrentC;
//
//	private Double baseKw;
//
//	private Double baseKwA;
//
//	private Double baseKwB;
//
//	private Double baseKwC;
//
//	private Double harmVoltA;
//
//	private Double harmVoltB;
//
//	private Double harmVoltC;
//
//	private Double harmCurrentA;
//
//	private Double harmCurrentB;
//
//	private Double harmCurrentC;
//
//	private Double harmKw;
//
//	private Double harmKwA;
//
//	private Double harmKwB;
//
//	private Double harmKwC;
//
//	private Double distorUa;
//
//	private Double distorUb;
//
//	private Double distorUc;
//
//	private Double totalVoltDistor;
//
//	private Double distorIa;
//
//	private Double distorIb;
//
//	private Double distorIc;
//
//	private Double totalCurrentDistor;
//
//	private Double harmUa2;
//
//	private Double harmUa3;
//
//	private Double harmUa4;
//
//	private Double harmUa5;
//
//	private Double harmUa6;
//
//	private Double harmUa7;
//
//	private Double harmUa8;
//
//	private Double harmUa9;
//
//	private Double harmUa10;
//
//	private Double harmUa11;
//
//	private Double harmUa12;
//
//	private Double harmUa13;
//
//	private Double harmUa14;
//
//	private Double harmUa15;
//
//	private Double harmUa16;
//
//	private Double harmUa17;
//
//	private Double harmUa18;
//
//	private Double harmUa19;
//
//	private Double harmUa20;
//
//	private Double harmUa21;
//
//	private Double harmUa22;
//
//	private Double harmUa23;
//
//	private Double harmUa24;
//
//	private Double harmUa25;
//
//	private Double harmUa26;
//
//	private Double harmUa27;
//
//	private Double harmUa28;
//
//	private Double harmUa29;
//
//	private Double harmUa30;
//	private Double harmUa31;
//	private Double oddHarmUa;
//	private Double evenHarmUa;
//	private Double ridgeUa;
//	private Double teleUa;
//	private Double harmUb2;
//	private Double harmUb3;
//	private Double harmUb4;
//	private Double harmUb5;
//	private Double harmUb6;
//	private Double harmUb7;
//	private Double harmUb8;
//	private Double harmUb9;
//	private Double harmUb10;
//	private Double harmUb11;
//	private Double harmUb12;
//	private Double harmUb13;
//	private Double harmUb14;
//	private Double harmUb15;
//	private Double harmUb16;
//	private Double harmUb17;
//	private Double harmUb18;
//
//	private Double harmUb19;
//	private Double harmUb20;
//	private Double harmUb21;
//	private Double harmUb22;
//	private Double harmUb23;
//	private Double harmUb24;
//	private Double harmUb25;
//	private Double harmUb26;
//	private Double harmUb27;
//	private Double harmUb28;
//	private Double harmUb29;
//	private Double harmUb30;
//	private Double harmUb31;
//	private Double oddHarmUb;
//	private Double evenHarmUb;
//	private Double ridgeUb;
//	private Double teleUb;
//	private Double harmUc2;
//
//	private Double harmUc3;
//
//	private Double harmUc4;
//
//	private Double harmUc5;
//
//	private Double harmUc6;
//
//	private Double harmUc7;
//
//	private Double harmUc8;
//
//	private Double harmUc9;
//
//	private Double harmUc10;
//
//	private Double harmUc11;
//
//	private Double harmUc12;
//
//	private Double harmUc13;
//	private Double harmUc14;
//
//	private Double harmUc15;
//
//	private Double harmUc16;
//	private Double harmUc17;
//
//	private Double harmUc18;
//
//	private Double harmUc19;
//
//	private Double harmUc20;
//
//	private Double harmUc21;
//
//	private Double harmUc22;
//
//	private Double harmUc23;
//
//	private Double harmUc24;
//
//	private Double harmUc25;
//
//	private Double harmUc26;
//
//	private Double harmUc27;
//
//	private Double harmUc28;
//
//	private Double harmUc29;
//
//	private Double harmUc30;
//
//	private Double harmUc31;
//
//	private Double oddHarmUc;
//
//	private Double evenHarmUc;
//
//	private Double ridgeUc;
//
//	private Double teleUc;
//
//	private Double harmIa2;
//
//	private Double harmIa3;
//
//	private Double harmIa4;
//
//	private Double harmIa5;
//
//	private Double harmIa6;
//
//	private Double harmIa7;
//	private Double harmIa8;
//
//	private Double harmIa9;
//
//	private Double harmIa10;
//
//	private Double harmIa11;
//
//	private Double harmIa12;
//
//	private Double harmIa13;
//
//	private Double harmIa14;
//
//	private Double harmIa15;
//
//	private Double harmIa16;
//
//	private Double harmIa17;
//
//	private Double harmIa18;
//
//	private Double harmIa19;
//
//	private Double harmIa20;
//
//	private Double harmIa21;
//
//	private Double harmIa22;
//
//	private Double harmIa23;
//
//	private Double harmIa24;
//
//	private Double harmIa25;
//
//	private Double harmIa26;
//
//	private Double harmIa27;
//
//	private Double harmIa28;
//
//	private Double harmIa29;
//
//	private Double harmIa30;
//
//	private Double harmIa31;
//
//	private Double oddHarmIa;
//
//	private Double evenHarmIa;
//
//	private Double kIa;
//
//	private Double harmIb2;
//
//	private Double harmIb3;
//
//	private Double harmIb4;
//
//	private Double harmIb5;
//
//	private Double harmIb6;
//
//	private Double harmIb7;
//
//	private Double harmIb8;
//
//	private Double harmIb9;
//
//	private Double harmIb10;
//
//	private Double harmIb11;
//
//	private Double harmIb12;
//
//	private Double harmIb13;
//
//	private Double harmIb14;
//
//	private Double harmIb15;
//
//	private Double harmIb16;
//
//	private Double harmIb17;
//
//	private Double harmIb18;
//
//	private Double harmIb19;
//
//	private Double harmIb20;
//
//	private Double harmIb21;
//
//	private Double harmIb22;
//
//	private Double harmIb23;
//
//	private Double harmIb24;
//
//	private Double harmIb25;
//
//	private Double harmIb26;
//
//	private Double harmIb27;
//
//	private Double harmIb28;
//
//	private Double harmIb29;
//
//	private Double harmIb30;
//
//	private Double harmIb31;
//
//	private Double oddHarmIb;
//
//	private Double evenHarmIb;
//
//	private Double kIb;
//
//	private Double harmIc2;
//
//	private Double harmIc3;
//
//	private Double harmIc4;
//
//	private Double harmIc5;
//
//	private Double harmIc6;
//
//	private Double harmIc7;
//
//	private Double harmIc8;
//
//	private Double harmIc9;
//
//	private Double harmIc10;
//
//	private Double harmIc11;
//
//	private Double harmIc12;
//
//	private Double harmIc13;
//
//	private Double harmIc14;
//
//	private Double harmIc15;
//
//	private Double harmIc16;
//
//	private Double harmIc17;
//
//	private Double harmIc18;
//
//	private Double harmIc19;
//
//	private Double harmIc20;
//
//	private Double harmIc21;
//
//	private Double harmIc22;
//
//	private Double harmIc23;
//
//	private Double harmIc24;
//
//	private Double harmIc25;
//
//	private Double harmIc26;
//
//	private Double harmIc27;
//
//	private Double harmIc28;
//
//	private Double harmIc29;
//
//	private Double harmIc30;
//
//	private Double harmIc31;
//
//	private Double oddHarmIc;
//
//	private Double evenHarmIc;
//
//	private Double kIc;
//
//	public DataElectricity getDataElectricity() {
//		return dataElectricity;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (!(obj instanceof DataAmHarm)) {
//			return false;
//		}
//		DataAmHarm dr = (DataAmHarm) obj;
//		if (dr.getDataElectricity().getId() == this.dataElectricity.getId()) {
//			return true;
//		}
//		return false;
//	}
//
//	@Override
//	public int hashCode() {
//		return this.getDataElectricity().getId().hashCode();
//	}
//
//	public void setDataElectricity(DataElectricity dataElectricity) {
//		this.dataElectricity = dataElectricity;
//	}
//
//	// public ReceiptCircuit getReceiptCircuit() {
//	// return receiptCircuit;
//	// }
//	//
//	// public void setReceiptCircuit(ReceiptCircuit receiptCircuit) {
//	// this.receiptCircuit = receiptCircuit;
//	// }
//
//	// public Date getReadTime() {
//	// return readTime;
//	// }
//	//
//	// public void setReadTime(Date readTime) {
//	// this.readTime = readTime;
//	// }
//	//
//	// public Date getInsertTime() {
//	// return insertTime;
//	// }
//	//
//	// public void setInsertTime(Date insertTime) {
//	// this.insertTime = insertTime;
//	// }
//
//	public Double getBaseVoltA() {
//		return baseVoltA;
//	}
//
//	public void setBaseVoltA(Double baseVoltA) {
//		this.baseVoltA = baseVoltA;
//	}
//
//	public Double getBaseVoltB() {
//		return baseVoltB;
//	}
//
//	public void setBaseVoltB(Double baseVoltB) {
//		this.baseVoltB = baseVoltB;
//	}
//
//	public Double getBaseVoltC() {
//		return baseVoltC;
//	}
//
//	public void setBaseVoltC(Double baseVoltC) {
//		this.baseVoltC = baseVoltC;
//	}
//
//	public Double getBaseCurrentA() {
//		return baseCurrentA;
//	}
//
//	public void setBaseCurrentA(Double baseCurrentA) {
//		this.baseCurrentA = baseCurrentA;
//	}
//
//	public Double getBaseCurrentB() {
//		return baseCurrentB;
//	}
//
//	public void setBaseCurrentB(Double baseCurrentB) {
//		this.baseCurrentB = baseCurrentB;
//	}
//
//	public Double getBaseCurrentC() {
//		return baseCurrentC;
//	}
//
//	public void setBaseCurrentC(Double baseCurrentC) {
//		this.baseCurrentC = baseCurrentC;
//	}
//
//	public Double getBaseKw() {
//		return baseKw;
//	}
//
//	public void setBaseKw(Double baseKw) {
//		this.baseKw = baseKw;
//	}
//
//	public Double getBaseKwA() {
//		return baseKwA;
//	}
//
//	public void setBaseKwA(Double baseKwA) {
//		this.baseKwA = baseKwA;
//	}
//
//	public Double getBaseKwB() {
//		return baseKwB;
//	}
//
//	public void setBaseKwB(Double baseKwB) {
//		this.baseKwB = baseKwB;
//	}
//
//	public Double getBaseKwC() {
//		return baseKwC;
//	}
//
//	public void setBaseKwC(Double baseKwC) {
//		this.baseKwC = baseKwC;
//	}
//
//	public Double getHarmVoltA() {
//		return harmVoltA;
//	}
//
//	public void setHarmVoltA(Double harmVoltA) {
//		this.harmVoltA = harmVoltA;
//	}
//
//	public Double getHarmVoltB() {
//		return harmVoltB;
//	}
//
//	public void setHarmVoltB(Double harmVoltB) {
//		this.harmVoltB = harmVoltB;
//	}
//
//	public Double getHarmVoltC() {
//		return harmVoltC;
//	}
//
//	public void setHarmVoltC(Double harmVoltC) {
//		this.harmVoltC = harmVoltC;
//	}
//
//	public Double getHarmCurrentA() {
//		return harmCurrentA;
//	}
//
//	public void setHarmCurrentA(Double harmCurrentA) {
//		this.harmCurrentA = harmCurrentA;
//	}
//
//	public Double getHarmCurrentB() {
//		return harmCurrentB;
//	}
//
//	public void setHarmCurrentB(Double harmCurrentB) {
//		this.harmCurrentB = harmCurrentB;
//	}
//
//	public Double getHarmCurrentC() {
//		return harmCurrentC;
//	}
//
//	public void setHarmCurrentC(Double harmCurrentC) {
//		this.harmCurrentC = harmCurrentC;
//	}
//
//	public Double getHarmKw() {
//		return harmKw;
//	}
//
//	public void setHarmKw(Double harmKw) {
//		this.harmKw = harmKw;
//	}
//
//	public Double getHarmKwA() {
//		return harmKwA;
//	}
//
//	public void setHarmKwA(Double harmKwA) {
//		this.harmKwA = harmKwA;
//	}
//
//	public Double getHarmKwB() {
//		return harmKwB;
//	}
//
//	public void setHarmKwB(Double harmKwB) {
//		this.harmKwB = harmKwB;
//	}
//
//	public Double getHarmKwC() {
//		return harmKwC;
//	}
//
//	public void setHarmKwC(Double harmKwC) {
//		this.harmKwC = harmKwC;
//	}
//
//	public Double getDistorUa() {
//		return distorUa;
//	}
//
//	public void setDistorUa(Double distorUa) {
//		this.distorUa = distorUa;
//	}
//
//	public Double getDistorUb() {
//		return distorUb;
//	}
//
//	public void setDistorUb(Double distorUb) {
//		this.distorUb = distorUb;
//	}
//
//	public Double getDistorUc() {
//		return distorUc;
//	}
//
//	public void setDistorUc(Double distorUc) {
//		this.distorUc = distorUc;
//	}
//
//	public Double getTotalVoltDistor() {
//		return totalVoltDistor;
//	}
//
//	public void setTotalVoltDistor(Double totalVoltDistor) {
//		this.totalVoltDistor = totalVoltDistor;
//	}
//
//	public Double getDistorIa() {
//		return distorIa;
//	}
//
//	public void setDistorIa(Double distorIa) {
//		this.distorIa = distorIa;
//	}
//
//	public Double getDistorIb() {
//		return distorIb;
//	}
//
//	public void setDistorIb(Double distorIb) {
//		this.distorIb = distorIb;
//	}
//
//	public Double getDistorIc() {
//		return distorIc;
//	}
//
//	public void setDistorIc(Double distorIc) {
//		this.distorIc = distorIc;
//	}
//
//	public Double getTotalCurrentDistor() {
//		return totalCurrentDistor;
//	}
//
//	public void setTotalCurrentDistor(Double totalCurrentDistor) {
//		this.totalCurrentDistor = totalCurrentDistor;
//	}
//
//	public Double getHarmUa2() {
//		return harmUa2;
//	}
//
//	public void setHarmUa2(Double harmUa2) {
//		this.harmUa2 = harmUa2;
//	}
//
//	public Double getHarmUa3() {
//		return harmUa3;
//	}
//
//	public void setHarmUa3(Double harmUa3) {
//		this.harmUa3 = harmUa3;
//	}
//
//	public Double getHarmUa4() {
//		return harmUa4;
//	}
//
//	public void setHarmUa4(Double harmUa4) {
//		this.harmUa4 = harmUa4;
//	}
//
//	public Double getHarmUa5() {
//		return harmUa5;
//	}
//
//	public void setHarmUa5(Double harmUa5) {
//		this.harmUa5 = harmUa5;
//	}
//
//	public Double getHarmUa6() {
//		return harmUa6;
//	}
//
//	public void setHarmUa6(Double harmUa6) {
//		this.harmUa6 = harmUa6;
//	}
//
//	public Double getHarmUa7() {
//		return harmUa7;
//	}
//
//	public void setHarmUa7(Double harmUa7) {
//		this.harmUa7 = harmUa7;
//	}
//
//	public Double getHarmUa8() {
//		return harmUa8;
//	}
//
//	public void setHarmUa8(Double harmUa8) {
//		this.harmUa8 = harmUa8;
//	}
//
//	public Double getHarmUa9() {
//		return harmUa9;
//	}
//
//	public void setHarmUa9(Double harmUa9) {
//		this.harmUa9 = harmUa9;
//	}
//
//	public Double getHarmUa10() {
//		return harmUa10;
//	}
//
//	public void setHarmUa10(Double harmUa10) {
//		this.harmUa10 = harmUa10;
//	}
//
//	public Double getHarmUa11() {
//		return harmUa11;
//	}
//
//	public void setHarmUa11(Double harmUa11) {
//		this.harmUa11 = harmUa11;
//	}
//
//	public Double getHarmUa12() {
//		return harmUa12;
//	}
//
//	public void setHarmUa12(Double harmUa12) {
//		this.harmUa12 = harmUa12;
//	}
//
//	public Double getHarmUa13() {
//		return harmUa13;
//	}
//
//	public void setHarmUa13(Double harmUa13) {
//		this.harmUa13 = harmUa13;
//	}
//
//	public Double getHarmUa14() {
//		return harmUa14;
//	}
//
//	public void setHarmUa14(Double harmUa14) {
//		this.harmUa14 = harmUa14;
//	}
//
//	public Double getHarmUa15() {
//		return harmUa15;
//	}
//
//	public void setHarmUa15(Double harmUa15) {
//		this.harmUa15 = harmUa15;
//	}
//
//	public Double getHarmUa16() {
//		return harmUa16;
//	}
//
//	public void setHarmUa16(Double harmUa16) {
//		this.harmUa16 = harmUa16;
//	}
//
//	public Double getHarmUa17() {
//		return harmUa17;
//	}
//
//	public void setHarmUa17(Double harmUa17) {
//		this.harmUa17 = harmUa17;
//	}
//
//	public Double getHarmUa18() {
//		return harmUa18;
//	}
//
//	public void setHarmUa18(Double harmUa18) {
//		this.harmUa18 = harmUa18;
//	}
//
//	public Double getHarmUa19() {
//		return harmUa19;
//	}
//
//	public void setHarmUa19(Double harmUa19) {
//		this.harmUa19 = harmUa19;
//	}
//
//	public Double getHarmUa20() {
//		return harmUa20;
//	}
//
//	public void setHarmUa20(Double harmUa20) {
//		this.harmUa20 = harmUa20;
//	}
//
//	public Double getHarmUa21() {
//		return harmUa21;
//	}
//
//	public void setHarmUa21(Double harmUa21) {
//		this.harmUa21 = harmUa21;
//	}
//
//	public Double getHarmUa22() {
//		return harmUa22;
//	}
//
//	public void setHarmUa22(Double harmUa22) {
//		this.harmUa22 = harmUa22;
//	}
//
//	public Double getHarmUa23() {
//		return harmUa23;
//	}
//
//	public void setHarmUa23(Double harmUa23) {
//		this.harmUa23 = harmUa23;
//	}
//
//	public Double getHarmUa24() {
//		return harmUa24;
//	}
//
//	public void setHarmUa24(Double harmUa24) {
//		this.harmUa24 = harmUa24;
//	}
//
//	public Double getHarmUa25() {
//		return harmUa25;
//	}
//
//	public void setHarmUa25(Double harmUa25) {
//		this.harmUa25 = harmUa25;
//	}
//
//	public Double getHarmUa26() {
//		return harmUa26;
//	}
//
//	public void setHarmUa26(Double harmUa26) {
//		this.harmUa26 = harmUa26;
//	}
//
//	public Double getHarmUa27() {
//		return harmUa27;
//	}
//
//	public void setHarmUa27(Double harmUa27) {
//		this.harmUa27 = harmUa27;
//	}
//
//	public Double getHarmUa28() {
//		return harmUa28;
//	}
//
//	public void setHarmUa28(Double harmUa28) {
//		this.harmUa28 = harmUa28;
//	}
//
//	public Double getHarmUa29() {
//		return harmUa29;
//	}
//
//	public void setHarmUa29(Double harmUa29) {
//		this.harmUa29 = harmUa29;
//	}
//
//	public Double getHarmUa30() {
//		return harmUa30;
//	}
//
//	public void setHarmUa30(Double harmUa30) {
//		this.harmUa30 = harmUa30;
//	}
//
//	public Double getHarmUa31() {
//		return harmUa31;
//	}
//
//	public void setHarmUa31(Double harmUa31) {
//		this.harmUa31 = harmUa31;
//	}
//
//	public Double getOddHarmUa() {
//		return oddHarmUa;
//	}
//
//	public void setOddHarmUa(Double oddHarmUa) {
//		this.oddHarmUa = oddHarmUa;
//	}
//
//	public Double getEvenHarmUa() {
//		return evenHarmUa;
//	}
//
//	public void setEvenHarmUa(Double evenHarmUa) {
//		this.evenHarmUa = evenHarmUa;
//	}
//
//	public Double getRidgeUa() {
//		return ridgeUa;
//	}
//
//	public void setRidgeUa(Double ridgeUa) {
//		this.ridgeUa = ridgeUa;
//	}
//
//	public Double getTeleUa() {
//		return teleUa;
//	}
//
//	public void setTeleUa(Double teleUa) {
//		this.teleUa = teleUa;
//	}
//
//	public Double getHarmUb2() {
//		return harmUb2;
//	}
//
//	public void setHarmUb2(Double harmUb2) {
//		this.harmUb2 = harmUb2;
//	}
//
//	public Double getHarmUb3() {
//		return harmUb3;
//	}
//
//	public void setHarmUb3(Double harmUb3) {
//		this.harmUb3 = harmUb3;
//	}
//
//	public Double getHarmUb4() {
//		return harmUb4;
//	}
//
//	public void setHarmUb4(Double harmUb4) {
//		this.harmUb4 = harmUb4;
//	}
//
//	public Double getHarmUb5() {
//		return harmUb5;
//	}
//
//	public void setHarmUb5(Double harmUb5) {
//		this.harmUb5 = harmUb5;
//	}
//
//	public Double getHarmUb6() {
//		return harmUb6;
//	}
//
//	public void setHarmUb6(Double harmUb6) {
//		this.harmUb6 = harmUb6;
//	}
//
//	public Double getHarmUb7() {
//		return harmUb7;
//	}
//
//	public void setHarmUb7(Double harmUb7) {
//		this.harmUb7 = harmUb7;
//	}
//
//	public Double getHarmUb8() {
//		return harmUb8;
//	}
//
//	public void setHarmUb8(Double harmUb8) {
//		this.harmUb8 = harmUb8;
//	}
//
//	public Double getHarmUb9() {
//		return harmUb9;
//	}
//
//	public void setHarmUb9(Double harmUb9) {
//		this.harmUb9 = harmUb9;
//	}
//
//	public Double getHarmUb10() {
//		return harmUb10;
//	}
//
//	public void setHarmUb10(Double harmUb10) {
//		this.harmUb10 = harmUb10;
//	}
//
//	public Double getHarmUb11() {
//		return harmUb11;
//	}
//
//	public void setHarmUb11(Double harmUb11) {
//		this.harmUb11 = harmUb11;
//	}
//
//	public Double getHarmUb12() {
//		return harmUb12;
//	}
//
//	public void setHarmUb12(Double harmUb12) {
//		this.harmUb12 = harmUb12;
//	}
//
//	public Double getHarmUb13() {
//		return harmUb13;
//	}
//
//	public void setHarmUb13(Double harmUb13) {
//		this.harmUb13 = harmUb13;
//	}
//
//	public Double getHarmUb14() {
//		return harmUb14;
//	}
//
//	public void setHarmUb14(Double harmUb14) {
//		this.harmUb14 = harmUb14;
//	}
//
//	public Double getHarmUb15() {
//		return harmUb15;
//	}
//
//	public void setHarmUb15(Double harmUb15) {
//		this.harmUb15 = harmUb15;
//	}
//
//	public Double getHarmUb16() {
//		return harmUb16;
//	}
//
//	public void setHarmUb16(Double harmUb16) {
//		this.harmUb16 = harmUb16;
//	}
//
//	public Double getHarmUb17() {
//		return harmUb17;
//	}
//
//	public void setHarmUb17(Double harmUb17) {
//		this.harmUb17 = harmUb17;
//	}
//
//	public Double getHarmUb18() {
//		return harmUb18;
//	}
//
//	public void setHarmUb18(Double harmUb18) {
//		this.harmUb18 = harmUb18;
//	}
//
//	public Double getHarmUb19() {
//		return harmUb19;
//	}
//
//	public void setHarmUb19(Double harmUb19) {
//		this.harmUb19 = harmUb19;
//	}
//
//	public Double getHarmUb20() {
//		return harmUb20;
//	}
//
//	public void setHarmUb20(Double harmUb20) {
//		this.harmUb20 = harmUb20;
//	}
//
//	public Double getHarmUb21() {
//		return harmUb21;
//	}
//
//	public void setHarmUb21(Double harmUb21) {
//		this.harmUb21 = harmUb21;
//	}
//
//	public Double getHarmUb22() {
//		return harmUb22;
//	}
//
//	public void setHarmUb22(Double harmUb22) {
//		this.harmUb22 = harmUb22;
//	}
//
//	public Double getHarmUb23() {
//		return harmUb23;
//	}
//
//	public void setHarmUb23(Double harmUb23) {
//		this.harmUb23 = harmUb23;
//	}
//
//	public Double getHarmUb24() {
//		return harmUb24;
//	}
//
//	public void setHarmUb24(Double harmUb24) {
//		this.harmUb24 = harmUb24;
//	}
//
//	public Double getHarmUb25() {
//		return harmUb25;
//	}
//
//	public void setHarmUb25(Double harmUb25) {
//		this.harmUb25 = harmUb25;
//	}
//
//	public Double getHarmUb26() {
//		return harmUb26;
//	}
//
//	public void setHarmUb26(Double harmUb26) {
//		this.harmUb26 = harmUb26;
//	}
//
//	public Double getHarmUb27() {
//		return harmUb27;
//	}
//
//	public void setHarmUb27(Double harmUb27) {
//		this.harmUb27 = harmUb27;
//	}
//
//	public Double getHarmUb28() {
//		return harmUb28;
//	}
//
//	public void setHarmUb28(Double harmUb28) {
//		this.harmUb28 = harmUb28;
//	}
//
//	public Double getHarmUb29() {
//		return harmUb29;
//	}
//
//	public void setHarmUb29(Double harmUb29) {
//		this.harmUb29 = harmUb29;
//	}
//
//	public Double getHarmUb30() {
//		return harmUb30;
//	}
//
//	public void setHarmUb30(Double harmUb30) {
//		this.harmUb30 = harmUb30;
//	}
//
//	public Double getHarmUb31() {
//		return harmUb31;
//	}
//
//	public void setHarmUb31(Double harmUb31) {
//		this.harmUb31 = harmUb31;
//	}
//
//	public Double getOddHarmUb() {
//		return oddHarmUb;
//	}
//
//	public void setOddHarmUb(Double oddHarmUb) {
//		this.oddHarmUb = oddHarmUb;
//	}
//
//	public Double getEvenHarmUb() {
//		return evenHarmUb;
//	}
//
//	public void setEvenHarmUb(Double evenHarmUb) {
//		this.evenHarmUb = evenHarmUb;
//	}
//
//	public Double getRidgeUb() {
//		return ridgeUb;
//	}
//
//	public void setRidgeUb(Double ridgeUb) {
//		this.ridgeUb = ridgeUb;
//	}
//
//	public Double getTeleUb() {
//		return teleUb;
//	}
//
//	public void setTeleUb(Double teleUb) {
//		this.teleUb = teleUb;
//	}
//
//	public Double getHarmUc2() {
//		return harmUc2;
//	}
//
//	public void setHarmUc2(Double harmUc2) {
//		this.harmUc2 = harmUc2;
//	}
//
//	public Double getHarmUc3() {
//		return harmUc3;
//	}
//
//	public void setHarmUc3(Double harmUc3) {
//		this.harmUc3 = harmUc3;
//	}
//
//	public Double getHarmUc4() {
//		return harmUc4;
//	}
//
//	public void setHarmUc4(Double harmUc4) {
//		this.harmUc4 = harmUc4;
//	}
//
//	public Double getHarmUc5() {
//		return harmUc5;
//	}
//
//	public void setHarmUc5(Double harmUc5) {
//		this.harmUc5 = harmUc5;
//	}
//
//	public Double getHarmUc6() {
//		return harmUc6;
//	}
//
//	public void setHarmUc6(Double harmUc6) {
//		this.harmUc6 = harmUc6;
//	}
//
//	public Double getHarmUc7() {
//		return harmUc7;
//	}
//
//	public void setHarmUc7(Double harmUc7) {
//		this.harmUc7 = harmUc7;
//	}
//
//	public Double getHarmUc8() {
//		return harmUc8;
//	}
//
//	public void setHarmUc8(Double harmUc8) {
//		this.harmUc8 = harmUc8;
//	}
//
//	public Double getHarmUc9() {
//		return harmUc9;
//	}
//
//	public void setHarmUc9(Double harmUc9) {
//		this.harmUc9 = harmUc9;
//	}
//
//	public Double getHarmUc10() {
//		return harmUc10;
//	}
//
//	public void setHarmUc10(Double harmUc10) {
//		this.harmUc10 = harmUc10;
//	}
//
//	public Double getHarmUc11() {
//		return harmUc11;
//	}
//
//	public void setHarmUc11(Double harmUc11) {
//		this.harmUc11 = harmUc11;
//	}
//
//	public Double getHarmUc12() {
//		return harmUc12;
//	}
//
//	public void setHarmUc12(Double harmUc12) {
//		this.harmUc12 = harmUc12;
//	}
//
//	public Double getHarmUc13() {
//		return harmUc13;
//	}
//
//	public void setHarmUc13(Double harmUc13) {
//		this.harmUc13 = harmUc13;
//	}
//
//	public Double getHarmUc14() {
//		return harmUc14;
//	}
//
//	public void setHarmUc14(Double harmUc14) {
//		this.harmUc14 = harmUc14;
//	}
//
//	public Double getHarmUc15() {
//		return harmUc15;
//	}
//
//	public void setHarmUc15(Double harmUc15) {
//		this.harmUc15 = harmUc15;
//	}
//
//	public Double getHarmUc16() {
//		return harmUc16;
//	}
//
//	public void setHarmUc16(Double harmUc16) {
//		this.harmUc16 = harmUc16;
//	}
//
//	public Double getHarmUc17() {
//		return harmUc17;
//	}
//
//	public void setHarmUc17(Double harmUc17) {
//		this.harmUc17 = harmUc17;
//	}
//
//	public Double getHarmUc18() {
//		return harmUc18;
//	}
//
//	public void setHarmUc18(Double harmUc18) {
//		this.harmUc18 = harmUc18;
//	}
//
//	public Double getHarmUc19() {
//		return harmUc19;
//	}
//
//	public void setHarmUc19(Double harmUc19) {
//		this.harmUc19 = harmUc19;
//	}
//
//	public Double getHarmUc20() {
//		return harmUc20;
//	}
//
//	public void setHarmUc20(Double harmUc20) {
//		this.harmUc20 = harmUc20;
//	}
//
//	public Double getHarmUc21() {
//		return harmUc21;
//	}
//
//	public void setHarmUc21(Double harmUc21) {
//		this.harmUc21 = harmUc21;
//	}
//
//	public Double getHarmUc22() {
//		return harmUc22;
//	}
//
//	public void setHarmUc22(Double harmUc22) {
//		this.harmUc22 = harmUc22;
//	}
//
//	public Double getHarmUc23() {
//		return harmUc23;
//	}
//
//	public void setHarmUc23(Double harmUc23) {
//		this.harmUc23 = harmUc23;
//	}
//
//	public Double getHarmUc24() {
//		return harmUc24;
//	}
//
//	public void setHarmUc24(Double harmUc24) {
//		this.harmUc24 = harmUc24;
//	}
//
//	public Double getHarmUc25() {
//		return harmUc25;
//	}
//
//	public void setHarmUc25(Double harmUc25) {
//		this.harmUc25 = harmUc25;
//	}
//
//	public Double getHarmUc26() {
//		return harmUc26;
//	}
//
//	public void setHarmUc26(Double harmUc26) {
//		this.harmUc26 = harmUc26;
//	}
//
//	public Double getHarmUc27() {
//		return harmUc27;
//	}
//
//	public void setHarmUc27(Double harmUc27) {
//		this.harmUc27 = harmUc27;
//	}
//
//	public Double getHarmUc28() {
//		return harmUc28;
//	}
//
//	public void setHarmUc28(Double harmUc28) {
//		this.harmUc28 = harmUc28;
//	}
//
//	public Double getHarmUc29() {
//		return harmUc29;
//	}
//
//	public void setHarmUc29(Double harmUc29) {
//		this.harmUc29 = harmUc29;
//	}
//
//	public Double getHarmUc30() {
//		return harmUc30;
//	}
//
//	public void setHarmUc30(Double harmUc30) {
//		this.harmUc30 = harmUc30;
//	}
//
//	public Double getHarmUc31() {
//		return harmUc31;
//	}
//
//	public void setHarmUc31(Double harmUc31) {
//		this.harmUc31 = harmUc31;
//	}
//
//	public Double getOddHarmUc() {
//		return oddHarmUc;
//	}
//
//	public void setOddHarmUc(Double oddHarmUc) {
//		this.oddHarmUc = oddHarmUc;
//	}
//
//	public Double getEvenHarmUc() {
//		return evenHarmUc;
//	}
//
//	public void setEvenHarmUc(Double evenHarmUc) {
//		this.evenHarmUc = evenHarmUc;
//	}
//
//	public Double getRidgeUc() {
//		return ridgeUc;
//	}
//
//	public void setRidgeUc(Double ridgeUc) {
//		this.ridgeUc = ridgeUc;
//	}
//
//	public Double getTeleUc() {
//		return teleUc;
//	}
//
//	public void setTeleUc(Double teleUc) {
//		this.teleUc = teleUc;
//	}
//
//	public Double getHarmIa2() {
//		return harmIa2;
//	}
//
//	public void setHarmIa2(Double harmIa2) {
//		this.harmIa2 = harmIa2;
//	}
//
//	public Double getHarmIa3() {
//		return harmIa3;
//	}
//
//	public void setHarmIa3(Double harmIa3) {
//		this.harmIa3 = harmIa3;
//	}
//
//	public Double getHarmIa4() {
//		return harmIa4;
//	}
//
//	public void setHarmIa4(Double harmIa4) {
//		this.harmIa4 = harmIa4;
//	}
//
//	public Double getHarmIa5() {
//		return harmIa5;
//	}
//
//	public void setHarmIa5(Double harmIa5) {
//		this.harmIa5 = harmIa5;
//	}
//
//	public Double getHarmIa6() {
//		return harmIa6;
//	}
//
//	public void setHarmIa6(Double harmIa6) {
//		this.harmIa6 = harmIa6;
//	}
//
//	public Double getHarmIa7() {
//		return harmIa7;
//	}
//
//	public void setHarmIa7(Double harmIa7) {
//		this.harmIa7 = harmIa7;
//	}
//
//	public Double getHarmIa8() {
//		return harmIa8;
//	}
//
//	public void setHarmIa8(Double harmIa8) {
//		this.harmIa8 = harmIa8;
//	}
//
//	public Double getHarmIa9() {
//		return harmIa9;
//	}
//
//	public void setHarmIa9(Double harmIa9) {
//		this.harmIa9 = harmIa9;
//	}
//
//	public Double getHarmIa10() {
//		return harmIa10;
//	}
//
//	public void setHarmIa10(Double harmIa10) {
//		this.harmIa10 = harmIa10;
//	}
//
//	public Double getHarmIa11() {
//		return harmIa11;
//	}
//
//	public void setHarmIa11(Double harmIa11) {
//		this.harmIa11 = harmIa11;
//	}
//
//	public Double getHarmIa12() {
//		return harmIa12;
//	}
//
//	public void setHarmIa12(Double harmIa12) {
//		this.harmIa12 = harmIa12;
//	}
//
//	public Double getHarmIa13() {
//		return harmIa13;
//	}
//
//	public void setHarmIa13(Double harmIa13) {
//		this.harmIa13 = harmIa13;
//	}
//
//	public Double getHarmIa14() {
//		return harmIa14;
//	}
//
//	public void setHarmIa14(Double harmIa14) {
//		this.harmIa14 = harmIa14;
//	}
//
//	public Double getHarmIa15() {
//		return harmIa15;
//	}
//
//	public void setHarmIa15(Double harmIa15) {
//		this.harmIa15 = harmIa15;
//	}
//
//	public Double getHarmIa16() {
//		return harmIa16;
//	}
//
//	public void setHarmIa16(Double harmIa16) {
//		this.harmIa16 = harmIa16;
//	}
//
//	public Double getHarmIa17() {
//		return harmIa17;
//	}
//
//	public void setHarmIa17(Double harmIa17) {
//		this.harmIa17 = harmIa17;
//	}
//
//	public Double getHarmIa18() {
//		return harmIa18;
//	}
//
//	public void setHarmIa18(Double harmIa18) {
//		this.harmIa18 = harmIa18;
//	}
//
//	public Double getHarmIa19() {
//		return harmIa19;
//	}
//
//	public void setHarmIa19(Double harmIa19) {
//		this.harmIa19 = harmIa19;
//	}
//
//	public Double getHarmIa20() {
//		return harmIa20;
//	}
//
//	public void setHarmIa20(Double harmIa20) {
//		this.harmIa20 = harmIa20;
//	}
//
//	public Double getHarmIa21() {
//		return harmIa21;
//	}
//
//	public void setHarmIa21(Double harmIa21) {
//		this.harmIa21 = harmIa21;
//	}
//
//	public Double getHarmIa22() {
//		return harmIa22;
//	}
//
//	public void setHarmIa22(Double harmIa22) {
//		this.harmIa22 = harmIa22;
//	}
//
//	public Double getHarmIa23() {
//		return harmIa23;
//	}
//
//	public void setHarmIa23(Double harmIa23) {
//		this.harmIa23 = harmIa23;
//	}
//
//	public Double getHarmIa24() {
//		return harmIa24;
//	}
//
//	public void setHarmIa24(Double harmIa24) {
//		this.harmIa24 = harmIa24;
//	}
//
//	public Double getHarmIa25() {
//		return harmIa25;
//	}
//
//	public void setHarmIa25(Double harmIa25) {
//		this.harmIa25 = harmIa25;
//	}
//
//	public Double getHarmIa26() {
//		return harmIa26;
//	}
//
//	public void setHarmIa26(Double harmIa26) {
//		this.harmIa26 = harmIa26;
//	}
//
//	public Double getHarmIa27() {
//		return harmIa27;
//	}
//
//	public void setHarmIa27(Double harmIa27) {
//		this.harmIa27 = harmIa27;
//	}
//
//	public Double getHarmIa28() {
//		return harmIa28;
//	}
//
//	public void setHarmIa28(Double harmIa28) {
//		this.harmIa28 = harmIa28;
//	}
//
//	public Double getHarmIa29() {
//		return harmIa29;
//	}
//
//	public void setHarmIa29(Double harmIa29) {
//		this.harmIa29 = harmIa29;
//	}
//
//	public Double getHarmIa30() {
//		return harmIa30;
//	}
//
//	public void setHarmIa30(Double harmIa30) {
//		this.harmIa30 = harmIa30;
//	}
//
//	public Double getHarmIa31() {
//		return harmIa31;
//	}
//
//	public void setHarmIa31(Double harmIa31) {
//		this.harmIa31 = harmIa31;
//	}
//
//	public Double getOddHarmIa() {
//		return oddHarmIa;
//	}
//
//	public void setOddHarmIa(Double oddHarmIa) {
//		this.oddHarmIa = oddHarmIa;
//	}
//
//	public Double getEvenHarmIa() {
//		return evenHarmIa;
//	}
//
//	public void setEvenHarmIa(Double evenHarmIa) {
//		this.evenHarmIa = evenHarmIa;
//	}
//
//	public Double getkIa() {
//		return kIa;
//	}
//
//	public void setkIa(Double kIa) {
//		this.kIa = kIa;
//	}
//
//	public Double getHarmIb2() {
//		return harmIb2;
//	}
//
//	public void setHarmIb2(Double harmIb2) {
//		this.harmIb2 = harmIb2;
//	}
//
//	public Double getHarmIb3() {
//		return harmIb3;
//	}
//
//	public void setHarmIb3(Double harmIb3) {
//		this.harmIb3 = harmIb3;
//	}
//
//	public Double getHarmIb4() {
//		return harmIb4;
//	}
//
//	public void setHarmIb4(Double harmIb4) {
//		this.harmIb4 = harmIb4;
//	}
//
//	public Double getHarmIb5() {
//		return harmIb5;
//	}
//
//	public void setHarmIb5(Double harmIb5) {
//		this.harmIb5 = harmIb5;
//	}
//
//	public Double getHarmIb6() {
//		return harmIb6;
//	}
//
//	public void setHarmIb6(Double harmIb6) {
//		this.harmIb6 = harmIb6;
//	}
//
//	public Double getHarmIb7() {
//		return harmIb7;
//	}
//
//	public void setHarmIb7(Double harmIb7) {
//		this.harmIb7 = harmIb7;
//	}
//
//	public Double getHarmIb8() {
//		return harmIb8;
//	}
//
//	public void setHarmIb8(Double harmIb8) {
//		this.harmIb8 = harmIb8;
//	}
//
//	public Double getHarmIb9() {
//		return harmIb9;
//	}
//
//	public void setHarmIb9(Double harmIb9) {
//		this.harmIb9 = harmIb9;
//	}
//
//	public Double getHarmIb10() {
//		return harmIb10;
//	}
//
//	public void setHarmIb10(Double harmIb10) {
//		this.harmIb10 = harmIb10;
//	}
//
//	public Double getHarmIb11() {
//		return harmIb11;
//	}
//
//	public void setHarmIb11(Double harmIb11) {
//		this.harmIb11 = harmIb11;
//	}
//
//	public Double getHarmIb12() {
//		return harmIb12;
//	}
//
//	public void setHarmIb12(Double harmIb12) {
//		this.harmIb12 = harmIb12;
//	}
//
//	public Double getHarmIb13() {
//		return harmIb13;
//	}
//
//	public void setHarmIb13(Double harmIb13) {
//		this.harmIb13 = harmIb13;
//	}
//
//	public Double getHarmIb14() {
//		return harmIb14;
//	}
//
//	public void setHarmIb14(Double harmIb14) {
//		this.harmIb14 = harmIb14;
//	}
//
//	public Double getHarmIb15() {
//		return harmIb15;
//	}
//
//	public void setHarmIb15(Double harmIb15) {
//		this.harmIb15 = harmIb15;
//	}
//
//	public Double getHarmIb16() {
//		return harmIb16;
//	}
//
//	public void setHarmIb16(Double harmIb16) {
//		this.harmIb16 = harmIb16;
//	}
//
//	public Double getHarmIb17() {
//		return harmIb17;
//	}
//
//	public void setHarmIb17(Double harmIb17) {
//		this.harmIb17 = harmIb17;
//	}
//
//	public Double getHarmIb18() {
//		return harmIb18;
//	}
//
//	public void setHarmIb18(Double harmIb18) {
//		this.harmIb18 = harmIb18;
//	}
//
//	public Double getHarmIb19() {
//		return harmIb19;
//	}
//
//	public void setHarmIb19(Double harmIb19) {
//		this.harmIb19 = harmIb19;
//	}
//
//	public Double getHarmIb20() {
//		return harmIb20;
//	}
//
//	public void setHarmIb20(Double harmIb20) {
//		this.harmIb20 = harmIb20;
//	}
//
//	public Double getHarmIb21() {
//		return harmIb21;
//	}
//
//	public void setHarmIb21(Double harmIb21) {
//		this.harmIb21 = harmIb21;
//	}
//
//	public Double getHarmIb22() {
//		return harmIb22;
//	}
//
//	public void setHarmIb22(Double harmIb22) {
//		this.harmIb22 = harmIb22;
//	}
//
//	public Double getHarmIb23() {
//		return harmIb23;
//	}
//
//	public void setHarmIb23(Double harmIb23) {
//		this.harmIb23 = harmIb23;
//	}
//
//	public Double getHarmIb24() {
//		return harmIb24;
//	}
//
//	public void setHarmIb24(Double harmIb24) {
//		this.harmIb24 = harmIb24;
//	}
//
//	public Double getHarmIb25() {
//		return harmIb25;
//	}
//
//	public void setHarmIb25(Double harmIb25) {
//		this.harmIb25 = harmIb25;
//	}
//
//	public Double getHarmIb26() {
//		return harmIb26;
//	}
//
//	public void setHarmIb26(Double harmIb26) {
//		this.harmIb26 = harmIb26;
//	}
//
//	public Double getHarmIb27() {
//		return harmIb27;
//	}
//
//	public void setHarmIb27(Double harmIb27) {
//		this.harmIb27 = harmIb27;
//	}
//
//	public Double getHarmIb28() {
//		return harmIb28;
//	}
//
//	public void setHarmIb28(Double harmIb28) {
//		this.harmIb28 = harmIb28;
//	}
//
//	public Double getHarmIb29() {
//		return harmIb29;
//	}
//
//	public void setHarmIb29(Double harmIb29) {
//		this.harmIb29 = harmIb29;
//	}
//
//	public Double getHarmIb30() {
//		return harmIb30;
//	}
//
//	public void setHarmIb30(Double harmIb30) {
//		this.harmIb30 = harmIb30;
//	}
//
//	public Double getHarmIb31() {
//		return harmIb31;
//	}
//
//	public void setHarmIb31(Double harmIb31) {
//		this.harmIb31 = harmIb31;
//	}
//
//	public Double getOddHarmIb() {
//		return oddHarmIb;
//	}
//
//	public void setOddHarmIb(Double oddHarmIb) {
//		this.oddHarmIb = oddHarmIb;
//	}
//
//	public Double getEvenHarmIb() {
//		return evenHarmIb;
//	}
//
//	public void setEvenHarmIb(Double evenHarmIb) {
//		this.evenHarmIb = evenHarmIb;
//	}
//
//	public Double getkIb() {
//		return kIb;
//	}
//
//	public void setkIb(Double kIb) {
//		this.kIb = kIb;
//	}
//
//	public Double getHarmIc2() {
//		return harmIc2;
//	}
//
//	public void setHarmIc2(Double harmIc2) {
//		this.harmIc2 = harmIc2;
//	}
//
//	public Double getHarmIc3() {
//		return harmIc3;
//	}
//
//	public void setHarmIc3(Double harmIc3) {
//		this.harmIc3 = harmIc3;
//	}
//
//	public Double getHarmIc4() {
//		return harmIc4;
//	}
//
//	public void setHarmIc4(Double harmIc4) {
//		this.harmIc4 = harmIc4;
//	}
//
//	public Double getHarmIc5() {
//		return harmIc5;
//	}
//
//	public void setHarmIc5(Double harmIc5) {
//		this.harmIc5 = harmIc5;
//	}
//
//	public Double getHarmIc6() {
//		return harmIc6;
//	}
//
//	public void setHarmIc6(Double harmIc6) {
//		this.harmIc6 = harmIc6;
//	}
//
//	public Double getHarmIc7() {
//		return harmIc7;
//	}
//
//	public void setHarmIc7(Double harmIc7) {
//		this.harmIc7 = harmIc7;
//	}
//
//	public Double getHarmIc8() {
//		return harmIc8;
//	}
//
//	public void setHarmIc8(Double harmIc8) {
//		this.harmIc8 = harmIc8;
//	}
//
//	public Double getHarmIc9() {
//		return harmIc9;
//	}
//
//	public void setHarmIc9(Double harmIc9) {
//		this.harmIc9 = harmIc9;
//	}
//
//	public Double getHarmIc10() {
//		return harmIc10;
//	}
//
//	public void setHarmIc10(Double harmIc10) {
//		this.harmIc10 = harmIc10;
//	}
//
//	public Double getHarmIc11() {
//		return harmIc11;
//	}
//
//	public void setHarmIc11(Double harmIc11) {
//		this.harmIc11 = harmIc11;
//	}
//
//	public Double getHarmIc12() {
//		return harmIc12;
//	}
//
//	public void setHarmIc12(Double harmIc12) {
//		this.harmIc12 = harmIc12;
//	}
//
//	public Double getHarmIc13() {
//		return harmIc13;
//	}
//
//	public void setHarmIc13(Double harmIc13) {
//		this.harmIc13 = harmIc13;
//	}
//
//	public Double getHarmIc14() {
//		return harmIc14;
//	}
//
//	public void setHarmIc14(Double harmIc14) {
//		this.harmIc14 = harmIc14;
//	}
//
//	public Double getHarmIc15() {
//		return harmIc15;
//	}
//
//	public void setHarmIc15(Double harmIc15) {
//		this.harmIc15 = harmIc15;
//	}
//
//	public Double getHarmIc16() {
//		return harmIc16;
//	}
//
//	public void setHarmIc16(Double harmIc16) {
//		this.harmIc16 = harmIc16;
//	}
//
//	public Double getHarmIc17() {
//		return harmIc17;
//	}
//
//	public void setHarmIc17(Double harmIc17) {
//		this.harmIc17 = harmIc17;
//	}
//
//	public Double getHarmIc18() {
//		return harmIc18;
//	}
//
//	public void setHarmIc18(Double harmIc18) {
//		this.harmIc18 = harmIc18;
//	}
//
//	public Double getHarmIc19() {
//		return harmIc19;
//	}
//
//	public void setHarmIc19(Double harmIc19) {
//		this.harmIc19 = harmIc19;
//	}
//
//	public Double getHarmIc20() {
//		return harmIc20;
//	}
//
//	public void setHarmIc20(Double harmIc20) {
//		this.harmIc20 = harmIc20;
//	}
//
//	public Double getHarmIc21() {
//		return harmIc21;
//	}
//
//	public void setHarmIc21(Double harmIc21) {
//		this.harmIc21 = harmIc21;
//	}
//
//	public Double getHarmIc22() {
//		return harmIc22;
//	}
//
//	public void setHarmIc22(Double harmIc22) {
//		this.harmIc22 = harmIc22;
//	}
//
//	public Double getHarmIc23() {
//		return harmIc23;
//	}
//
//	public void setHarmIc23(Double harmIc23) {
//		this.harmIc23 = harmIc23;
//	}
//
//	public Double getHarmIc24() {
//		return harmIc24;
//	}
//
//	public void setHarmIc24(Double harmIc24) {
//		this.harmIc24 = harmIc24;
//	}
//
//	public Double getHarmIc25() {
//		return harmIc25;
//	}
//
//	public void setHarmIc25(Double harmIc25) {
//		this.harmIc25 = harmIc25;
//	}
//
//	public Double getHarmIc26() {
//		return harmIc26;
//	}
//
//	public void setHarmIc26(Double harmIc26) {
//		this.harmIc26 = harmIc26;
//	}
//
//	public Double getHarmIc27() {
//		return harmIc27;
//	}
//
//	public void setHarmIc27(Double harmIc27) {
//		this.harmIc27 = harmIc27;
//	}
//
//	public Double getHarmIc28() {
//		return harmIc28;
//	}
//
//	public void setHarmIc28(Double harmIc28) {
//		this.harmIc28 = harmIc28;
//	}
//
//	public Double getHarmIc29() {
//		return harmIc29;
//	}
//
//	public void setHarmIc29(Double harmIc29) {
//		this.harmIc29 = harmIc29;
//	}
//
//	public Double getHarmIc30() {
//		return harmIc30;
//	}
//
//	public void setHarmIc30(Double harmIc30) {
//		this.harmIc30 = harmIc30;
//	}
//
//	public Double getHarmIc31() {
//		return harmIc31;
//	}
//
//	public void setHarmIc31(Double harmIc31) {
//		this.harmIc31 = harmIc31;
//	}
//
//	public Double getOddHarmIc() {
//		return oddHarmIc;
//	}
//
//	public void setOddHarmIc(Double oddHarmIc) {
//		this.oddHarmIc = oddHarmIc;
//	}
//
//	public Double getEvenHarmIc() {
//		return evenHarmIc;
//	}
//
//	public void setEvenHarmIc(Double evenHarmIc) {
//		this.evenHarmIc = evenHarmIc;
//	}
//
//	public Double getkIc() {
//		return kIc;
//	}
//
//	public void setkIc(Double kIc) {
//		this.kIc = kIc;
//	}
//}
