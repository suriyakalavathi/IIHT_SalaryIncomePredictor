package com.cognizant.salary.userinput;

import com.cognizant.salary.validator.IncrementValidator;
import com.cognizant.salary.validator.Validator;
import com.cognizant.salary.validator.ValueType;

public class Deduction extends UserInput {
    private static final String ded_amt_message = "Please enter the deduction amount in $: ";
    private static final String validationFailureMsg = "Deduction amount must be $0 or greater: ";

    @Override
    protected String getUserInputMessage() {
        return ded_amt_message;
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
