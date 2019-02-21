package com.infogain.exception;

public class AppException extends RuntimeException {
	private static final long serialVersionUID = -7716234137063227118L;
	
	public AppException(String message, Throwable cause) {
		super(message, cause);
	}

}
