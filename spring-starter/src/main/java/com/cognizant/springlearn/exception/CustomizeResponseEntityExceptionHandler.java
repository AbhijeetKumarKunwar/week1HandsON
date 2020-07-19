package com.cognizant.springlearn.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
//This will provide response back to the all  controller
@ControllerAdvice
//This is apllicable to all others controller, we use when we have to share the 
//component to all controller class ,it also handle date
public class CustomizeResponseEntityExceptionHandler 
extends ResponseEntityExceptionHandler 
{

	 @Override
	    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	            HttpHeaders headers,HttpStatus status,WebRequest request) {
	        ExceptionResponse exrs=new ExceptionResponse(new Date(),"Validation failded",ex.getBindingResult().toString());
	        return new ResponseEntity(exrs, HttpStatus.BAD_REQUEST);
	    }
}