package com.cognizant.salary.userinput;

import com.cognizant.salary.validator.IncrementFrequencyValidator;
import com.cognizant.salary.validator.Validator;
import com.cognizant.salary.validator.ValueType;

public class IncrementFrequency extends UserInput {
    private static final String inc_freq_message = "Please enter the increment frequency in years: ";
    private static final String validationFailureMsg = "Increment frequency must be 3 (Quarterly) or 6 (Half-Yearly) or 12 (Annually): ";

    @Override
    protected String getUserInputMessage() {
        return inc_freq_message;
    }

    @Override
    protected String getValidationFailureMessage() {
        return validationFailureMsg;
    }

    @Override
    protected ValueType getValidatorType() { return ValueType.MULTI_VALUE; }

    @Override
    protected Validator getValidator() { return new IncrementFrequencyValidator(); }
}
