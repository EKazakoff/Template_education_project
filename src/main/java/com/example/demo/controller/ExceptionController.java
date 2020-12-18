package com.example.demo.controller;

import com.example.demo.view.ErrorMsg;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.UUID;


/**
 * The type Exception controller.
 */
@ControllerAdvice
public class ExceptionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

    /**
     * Handle loglevel client exception response entity.
     *
     * @param e the e
     * @return the response entity
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMsg> handleLoglevelClientException(Exception e) {

        UUID exUid = UUID.randomUUID();
        LOGGER.error("Internal server Error " + exUid, e);
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorMsg("Internal server Error " + exUid));
    }

    /**
     * Data integrity violation exception response entity.
     *
     * @param e the e
     * @return the response entity
     */
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorMsg> dataIntegrityViolationException(final DataIntegrityViolationException e) {
        String mostSpecificCauseMessage = e.getMostSpecificCause().getMessage();
        if (e.getCause() instanceof ConstraintViolationException) {
            String name = ((ConstraintViolationException) e.getCause()).getConstraintName();
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorMsg("Validation exception in " +  name ));
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorMsg("Validation exception in " +  mostSpecificCauseMessage ));
        }
    }

    /**
     * Method argument not valid exception response entity.
     *
     * @param e the e
     * @return the response entity
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorMsg> methodArgumentNotValidException(final MethodArgumentNotValidException e) {
        StringBuilder sb = new StringBuilder();
        e.getBindingResult().getFieldErrors().forEach(fieldError -> {
            sb.append(fieldError.getField() + ": " + fieldError.getRejectedValue() + " ");
        });
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorMsg("Validation exception " + sb.toString()));
    }
}
