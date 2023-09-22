package com.JatinPandey.address.ControllerAdvice;


import com.JatinPandey.address.Exceptions.ResourceNotFoundException;
import com.JatinPandey.address.Payloads.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RuntimeExceptionsAdvice {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        return new ResponseEntity<>(new ApiResponse(resourceNotFoundException.getMessage(),false), HttpStatus.NOT_FOUND);
    }

}
