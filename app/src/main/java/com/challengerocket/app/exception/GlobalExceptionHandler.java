package com.challengerocket.app.exception;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import com.challengerocket.app.util.ErrorDetails;

import java.util.Date;

/**
 * Exception handler class that transforms
 * the error into more concise messages.
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ConfigDataResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ConfigDataResourceNotFoundException exception,
                                                                        WebRequest request){
        ErrorDetails details = new ErrorDetails(new Date(), exception.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> manejarGlobalException(Exception exception,
                                                               WebRequest request) {
        ErrorDetails details = new ErrorDetails(new Date(), exception.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
