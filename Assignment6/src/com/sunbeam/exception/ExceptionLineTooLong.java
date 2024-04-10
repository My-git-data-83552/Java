package com.sunbeam.exception;

//unchecked Exception
public class ExceptionLineTooLong extends RuntimeException {
	private String message;

	public ExceptionLineTooLong() {
		// TODO Auto-generated constructor stub
		message = "";
	}

	public ExceptionLineTooLong(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("Exception : ");
		System.err.println("ExceptionLineTooLong : " + message);

	}

}
