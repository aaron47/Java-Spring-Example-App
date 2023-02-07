package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class StudentNotFoundException extends ResponseStatusException {
    public StudentNotFoundException(Long studentId) {
        super(HttpStatus.NOT_FOUND, "student with id " + studentId + " does not exist");
    }
}
