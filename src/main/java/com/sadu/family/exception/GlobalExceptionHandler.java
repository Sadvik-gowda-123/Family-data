package com.sadu.family.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({InvalidNameException.class})
    public ResponseEntity<ErrorResponse> nameNotFound(InvalidNameException e) {
        return new ResponseEntity<>(getErrorResponse(e.getMessage()), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exception(Exception e) {
        return new ResponseEntity<>(getErrorResponse(e.getMessage()), HttpStatus.NOT_FOUND);
    }


    private ErrorResponse getErrorResponse(String msg) {
        ErrorResponse errorResponse= new ErrorResponse();
        errorResponse.setErrorMessage(msg);
        errorResponse.setLocalDateTime(LocalDateTime.now());
        return errorResponse;
    }
}
