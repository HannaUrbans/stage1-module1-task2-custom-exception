package com.epam.mjc;

public class StudentIsNotFoundByIdException extends Exception {

    public StudentIsNotFoundByIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
