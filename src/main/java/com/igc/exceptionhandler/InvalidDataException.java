package com.igc.exceptionhandler;

public class InvalidDataException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidDataException(String Message) {
		super(Message);
	}

}
