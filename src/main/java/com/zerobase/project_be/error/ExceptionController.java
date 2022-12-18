package com.zerobase.project_be.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
        
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> CustomExceptionHandler(CustomException ex) {
        return ResponseEntity.ok(ex.toString());
    }
}
