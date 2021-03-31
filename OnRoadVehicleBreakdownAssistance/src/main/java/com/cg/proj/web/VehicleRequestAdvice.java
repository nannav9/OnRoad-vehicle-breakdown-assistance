package com.cg.proj.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.proj.DTO.ErrorMessageDTO;
import com.cg.proj.exceptions.MechanicNotFoundException;
import com.cg.proj.exceptions.RequestNotFoundException;
import com.cg.proj.exceptions.UserNotFoundException;
import com.cg.proj.exceptions.ValidateException;

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

	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ErrorMessageDTO handlesUserNotFound(UserNotFoundException exception) {
		return new ErrorMessageDTO(exception.getMessage(), HttpStatus.NOT_FOUND.toString());
	}

	@ExceptionHandler(ValidateException.class)
	@ResponseStatus(HttpStatus.FORBIDDEN)
	public ErrorMessageDTO handleValidateException(ValidateException exception) {
		List<String> lstmesagges = exception.getLserror().stream().map(m -> m.getDefaultMessage().toString())
				.collect(Collectors.toList());
		return new ErrorMessageDTO(lstmesagges);
	}

}
