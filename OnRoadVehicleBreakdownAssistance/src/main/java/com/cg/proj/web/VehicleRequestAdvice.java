package com.cg.proj.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.proj.DTO.ErrorMessageDTO;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;

@RestControllerAdvice
public class VehicleRequestAdvice {
	@ExceptionHandler(MechanicNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ErrorMessageDTO handlesMechanicNotFound(MechanicNotFoundException exception) {
		return new ErrorMessageDTO(exception.getMessage(), HttpStatus.NOT_FOUND.toString());
	}

	@ExceptionHandler(RequestNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ErrorMessageDTO handlesRequestNotFound(RequestNotFoundException exception) {
		return new ErrorMessageDTO(exception.getMessage(), HttpStatus.NOT_FOUND.toString());
	}
}
