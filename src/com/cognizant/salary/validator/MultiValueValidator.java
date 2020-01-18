package com.cognizant.salary.validator;

public interface MultiValueValidator {
    boolean validate(String inputValue, int[] arrayValues);
}
