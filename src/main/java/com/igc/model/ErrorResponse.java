package com.igc.model;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {
	
	String errorMessage;
	String errorID;
	String TimeStamp;
	
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorID() {
		return errorID;
	}
	public void setErrorID(String errorID) {
		this.errorID = errorID;
	}
	public String getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	
	

}
