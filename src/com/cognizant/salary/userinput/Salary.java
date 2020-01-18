package com.cognizant.salary.userinput;

import com.cognizant.salary.validator.Validator;
import com.cognizant.salary.validator.ValueType;
import com.cognizant.salary.validator.SalaryValidator;

public class Salary extends UserInput {
    private static final String startingSal_Message = "Please enter the starting salary in $: ";
    private static final String validationFailureMsg = "Starting salary must be $1 or above: ";

    @Override
    protected String getUserInputMessage() {
        return startingSal_Message;
    }

    @Override
    protected String getValidationFailureMessage() {
        return validationFailureMsg;
    }

    @Override
    protected ValueType getValidatorType() { return ValueType.SINGLE_VALUE; }

    @Override
    protected Validator getValidator() {
        return new SalaryValidator();
    }
}
