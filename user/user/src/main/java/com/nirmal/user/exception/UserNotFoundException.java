package com.nirmal.user.exception;

public class UserNotFoundException extends Throwable {

	private static final long serialVersionUID = 1L;
	
	private String message;

	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
