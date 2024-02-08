package com.epam.mjc;

public class StudentIsNotFoundByIdException extends IllegalArgumentException {

    public StudentIsNotFoundByIdException(long id) {
        super("Could not find student with ID " + id);
    }
}
