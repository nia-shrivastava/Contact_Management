package neha.evolent.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ContactRestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ContactErrorResponse> handleException(ContactNotFoundException ex){
		
		ContactErrorResponse error = new ContactErrorResponse(
				                          HttpStatus.NOT_FOUND.value(),
				                          ex.getMessage(),
				                          System.currentTimeMillis());
		
		return new ResponseEntity<ContactErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ContactErrorResponse> handleException(Exception ex){
		
		ContactErrorResponse error = new ContactErrorResponse(
				                          HttpStatus.BAD_REQUEST.value(),
				                          ex.getMessage(),
				                          System.currentTimeMillis());
		
		return new ResponseEntity<ContactErrorResponse>(error,HttpStatus.BAD_REQUEST);
	}


}
