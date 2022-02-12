package com.igc.model;

import org.springframework.stereotype.Component;

@Component
public class RequestModel {
	
	String icin;
	String companyName;
	
	
	public String getICIN() {
		return icin;
	}
	public void setICIN(String iCIN) {
		icin = iCIN;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
}
