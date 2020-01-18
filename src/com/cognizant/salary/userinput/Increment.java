package com.cognizant.salary.userinput;

import com.cognizant.salary.validator.IncrementValidator;
import com.cognizant.salary.validator.Validator;
import com.cognizant.salary.validator.ValueType;

public class Increment extends UserInput {
    private static final String inc_percent_message = "Please enter the increment percentage between 0% and 100%: ";
    private static final String validationFailureMsg = "Increment percentage must be 0% or greater: ";

    @Override
    protected String getUserInputMessage() {
        return inc_percent_message;
    }

    @Override
    protected String getValidationFailureMessage() {
        return validationFailureMsg;
    }

    @Override
    protected ValueType getValidatorType() { return ValueType.SINGLE_VALUE; }

    @Override
    protected Validator getValidator() {
        return new IncrementValidator();
    }
}
