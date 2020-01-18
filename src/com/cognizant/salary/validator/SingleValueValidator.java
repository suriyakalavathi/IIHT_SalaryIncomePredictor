package com.cognizant.salary.validator;

public interface SingleValueValidator {
    boolean validate(String inputValue, int minimumValue);
}
