package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.entity.EmployeeErrorResponse;
import com.example.demo.entity.ValidEmployeeErrorResponse;


@ControllerAdvice
public class EmployeeExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exception) {
		EmployeeErrorResponse error = new EmployeeErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);  //404 Not found
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> addValidationException(MethodArgumentNotValidException exception){
		ValidEmployeeErrorResponse response = new ValidEmployeeErrorResponse(HttpStatus.BAD_REQUEST.value(),"Validation Error", new Date(),exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		
	}
}
