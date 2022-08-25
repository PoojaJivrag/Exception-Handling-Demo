package com.BikkadIT.exceptions;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionMapper {

	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionMessage> hanldeArithmeticException(ArithmeticException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA001");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	
	@ExceptionHandler(value=NullPointerException.class)
	public ResponseEntity<ExceptionMessage> hanldenullPointerException(NullPointerException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA002");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	@ExceptionHandler(value=ArrayIndexOutOfBoundsException.class)
	public ResponseEntity<ExceptionMessage> handleArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA003");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}

	
	@ExceptionHandler(value=NumberFormatException.class)
	public ResponseEntity<ExceptionMessage> handleNumberFormatException(NumberFormatException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA004");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	@ExceptionHandler(value=ArrayStoreException.class)
	public ResponseEntity<ExceptionMessage> handleArrayStoreException(ArrayStoreException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA005");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	
	@ExceptionHandler(value=StringIndexOutOfBoundsException.class)
	public ResponseEntity<ExceptionMessage> handleStringIndexOutOfBoundsException(StringIndexOutOfBoundsException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA006");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	
	@ExceptionHandler(value=NegativeArraySizeException.class)
	public ResponseEntity<ExceptionMessage> handleNegativeArraySizeException(NegativeArraySizeException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA007");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	@ExceptionHandler(value=UnsupportedOperationException.class)
	public ResponseEntity<ExceptionMessage> handleUnsupportedOperationException(UnsupportedOperationException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA008");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	
	@ExceptionHandler(value=InputMismatchException.class)
	public ResponseEntity<ExceptionMessage> handleInputMismatchException(InputMismatchException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA009");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	@ExceptionHandler(value=MissingResourceException.class)
	public ResponseEntity<ExceptionMessage> handleMissingResourceException(MissingResourceException e){
	
		ExceptionMessage exceptionMessage=new ExceptionMessage();
		exceptionMessage.setCode("PBA0010");
		exceptionMessage.setMsg(e.getMessage());
		exceptionMessage.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity<ExceptionMessage>(exceptionMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	
	
	
	
	


}