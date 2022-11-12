package com.epam.mjc;

public class StudentNotFoundExemption extends IllegalArgumentException {

    public StudentNotFoundExemption(String message) {
        super(message);
    }

}
