package com.example.demo.controller;

import com.example.demo.view.ErrorMsg;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMsg> handleLoglevelClientException(Exception e) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorMsg(e.getMessage()));
    }
}
