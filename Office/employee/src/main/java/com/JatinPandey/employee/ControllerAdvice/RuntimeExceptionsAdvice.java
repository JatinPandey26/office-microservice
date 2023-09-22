package com.JatinPandey.employee.ControllerAdvice;


import com.JatinPandey.employee.Exceptions.ResourceNotFoundException;
import com.JatinPandey.employee.Payloads.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RuntimeExceptionsAdvice {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        return new ResponseEntity<ApiResponse>(new ApiResponse(resourceNotFoundException.getMessage(),false), HttpStatus.NOT_FOUND);
    }

}
