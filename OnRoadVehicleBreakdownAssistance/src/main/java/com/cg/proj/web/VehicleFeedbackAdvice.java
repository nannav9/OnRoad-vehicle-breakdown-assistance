package com.cg.proj.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.proj.DTO.ErrorMessageDTO;
import com.cg.proj.exceptions.FeedbackNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;

@RestControllerAdvice
public class VehicleFeedbackAdvice {

	@ExceptionHandler(FeedbackNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ErrorMessageDTO handlesRequestNotFound(RequestNotFoundException exception) {
		return new ErrorMessageDTO(exception.getMessage(), HttpStatus.NOT_FOUND.toString());
	}
}
