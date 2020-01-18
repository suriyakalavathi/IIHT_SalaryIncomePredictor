package com.cognizant.salary.validator;

import java.util.stream.IntStream;

public abstract class Validator {

    private static final String ALL_DIGITS = "\\d+";

    protected abstract int getMinimum();

    public final boolean validate(String inputValue) {
        SingleValueValidator singleValueValidator = (inVal, minVal) -> {
            return null != inVal && inVal.matches(ALL_DIGITS) && Integer.parseInt(inVal) >= minVal;
        };
        return singleValueValidator.validate(inputValue, getMinimum());
    }

    protected abstract int[] getValues();

    public final boolean anyMatch(String inputValue) {
        MultiValueValidator multiValuesValidator =
                (inVal, ranVal) -> null != inVal && inVal.matches(ALL_DIGITS) && IntStream.of(ranVal).anyMatch(x -> x == Integer.parseInt(inVal));
        return multiValuesValidator.validate(inputValue, getValues());
    }
}
