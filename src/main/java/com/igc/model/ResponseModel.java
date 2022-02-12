package com.igc.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseModel {

	String icin;
	String companyName;
	String yield;
	String faceValue;
	String couponRate;
	String maturityDate;
	String lastTradedprice;
	String lastTradeddate;
	String timeStamp;
	
	public String getIcin() {
		return icin;
	}
	public void setIcin(String icin) {
		this.icin = icin;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getYield() {
		return yield;
	}
	public void setYield(String yield) {
		this.yield = yield;
	}
	public String getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}
	public String getCouponRate() {
		return couponRate;
	}
	public void setCouponRate(String couponRate) {
		this.couponRate = couponRate;
	}
	public String getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	public String getLastTradedprice() {
		return lastTradedprice;
	}
	public void setLastTradedprice(String lastTradedprice) {
		this.lastTradedprice = lastTradedprice;
	}
	public String getLastTradeddate() {
		return lastTradeddate;
	}
	public void setLastTradeddate(String lastTradeddate) {
		this.lastTradeddate = lastTradeddate;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public ResponseModel(String icin, String companyName, String yield, String faceValue, String couponRate,
			String maturityDate, String lastTradedprice, String lastTradeddate, String timeStamp) {
		this.icin = icin;
		this.companyName = companyName;
		this.yield = yield;
		this.faceValue = faceValue;
		this.couponRate = couponRate;
		this.maturityDate = maturityDate;
		this.lastTradedprice = lastTradedprice;
		this.lastTradeddate = lastTradeddate;
		this.timeStamp = timeStamp;
	}
	
	public ResponseModel() {
	}
	
	@Override
	public String toString() {
		return "ResponseModel [icin=" + icin + ", companyName=" + companyName + ", yield=" + yield + ", faceValue="
				+ faceValue + ", couponRate=" + couponRate + ", maturityDate=" + maturityDate + ", lastTradedprice="
				+ lastTradedprice + ", lastTradeddate=" + lastTradeddate + ", timeStamp=" + timeStamp + "]";
	}

}
