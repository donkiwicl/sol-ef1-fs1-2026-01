package dev.donwiki.caseone.dev.donkiwi.caseone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionUtil {

    @ExceptionHandler(Exception.class)
    public ResponseEntity generalException(){
        return ResponseEntity.badRequest().build();
    }
    

}
