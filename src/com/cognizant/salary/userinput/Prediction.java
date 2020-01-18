package com.cognizant.salary.userinput;

import com.cognizant.salary.validator.Validator;
import com.cognizant.salary.validator.ValueType;
import com.cognizant.salary.validator.PredictionValidator;

public class Prediction extends UserInput {
    private static final String prediction_yr_Message = "Please enter the prediction years: ";
    private static final String validationFailureMsg = "Prediction years must be one of these (5,10,20,30,40,50): ";

    @Override
    protected String getUserInputMessage() {
        return prediction_yr_Message;
    }

    @Override
    protected String getValidationFailureMessage() {
        return validationFailureMsg;
    }

    @Override
    protected ValueType getValidatorType() { return ValueType.MULTI_VALUE; }

    @Override
    protected Validator getValidator() {
        return new PredictionValidator();
    }
}
