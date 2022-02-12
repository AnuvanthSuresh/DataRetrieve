package com.igc.exceptionhandler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.igc.model.ErrorResponse;
import com.igc.utils.Constants;

@RestControllerAdvice
public class Handler {
	
	@Autowired
	ErrorResponse errorResponse;
		
	@ExceptionHandler(InvalidDataException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse handleInvalidDataException(InvalidDataException exception) {
		errorResponse.setErrorMessage(exception.getMessage());
		errorResponse.setErrorID("Default");
		errorResponse.setTimeStamp(new SimpleDateFormat(Constants.DateFormat).format(new Date()));
		return errorResponse;
	}
	
	
	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse handleNullpointerException(NullPointerException exception) {
		errorResponse.setErrorMessage(exception.getMessage());
		errorResponse.setErrorID("Default");
		errorResponse.setTimeStamp(new SimpleDateFormat(Constants.DateFormat).format(new Date()));
		return errorResponse;
	}
	
	@ExceptionHandler(AuthenticationException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public ErrorResponse handleUnauthorisedException(NullPointerException exception) {
		errorResponse.setErrorMessage(exception.getMessage());
		errorResponse.setErrorID("Default");
		errorResponse.setTimeStamp(new SimpleDateFormat(Constants.DateFormat).format(new Date()));
		return errorResponse;
	}

}
