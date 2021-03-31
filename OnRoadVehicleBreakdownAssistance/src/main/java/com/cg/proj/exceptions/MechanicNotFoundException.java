package com.cg.proj.exceptions;

public class MechanicNotFoundException extends Exception {

	public MechanicNotFoundException() {
		super();

	}

	public MechanicNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public MechanicNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public MechanicNotFoundException(String message) {
		super(message);

	}

	public MechanicNotFoundException(Throwable cause) {
		super(cause);

	}

}
