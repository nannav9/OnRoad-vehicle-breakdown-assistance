package com.cg.proj.exceptions;

public class RequestNotFoundException extends Exception {
	public RequestNotFoundException() {
		super();

	}

	public RequestNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public RequestNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public RequestNotFoundException(String message) {
		super(message);

	}

	public RequestNotFoundException(Throwable cause) {
		super(cause);

	}

}
