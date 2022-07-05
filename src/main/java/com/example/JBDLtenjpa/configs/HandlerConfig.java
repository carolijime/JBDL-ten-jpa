package com.example.JBDLtenjpa.configs;

import com.example.JBDLtenjpa.exceptions.PersonNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerConfig {

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity handlePersonNotFoundException(PersonNotFoundException ex){
        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
