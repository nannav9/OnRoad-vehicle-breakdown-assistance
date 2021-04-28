package com.cg.proj.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.FieldError;

public class ValidateException extends Exception {

	List<FieldError> lserror = new ArrayList<>();

	public ValidateException() {
		super();
		
	}

	public ValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public ValidateException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ValidateException(String message) {
		super(message);
		
	}

	public ValidateException(Throwable cause) {
		super(cause);
		
	}

	public ValidateException(List<FieldError> lserror) {
		super();
		this.lserror = lserror;
	}

	public List<FieldError> getLserror() {
		return lserror;
	}

	public void setLserror(List<FieldError> lserror) {
		this.lserror = lserror;
	}

}
