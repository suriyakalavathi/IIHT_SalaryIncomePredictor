package com.cognizant.salary.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cognizant.salary.validator.Validator;
import com.cognizant.salary.validator.ValueType;

public abstract class UserInput {
    protected abstract  String getUserInputMessage();

    protected abstract String getValidationFailureMessage();

    protected abstract ValueType getValidatorType();

    protected abstract Validator getValidator();

    private String get(String errorMessage, String promptMessage) throws IOException
    {
        if (null != errorMessage) {
            System.out.println(errorMessage);
        }
        System.out.print(promptMessage);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return in.readLine();
    }

    public int get() {
        String inputValue = null;

        boolean isValid = true;
        do {
            try {
                inputValue = get(isValid ? "" : getValidationFailureMessage(), getUserInputMessage());
            } catch (IOException e) { inputValue = null; }
            isValid = ValueType.SINGLE_VALUE == getValidatorType()
                        ? getValidator().validate(inputValue) : getValidator().anyMatch(inputValue);
        } while (!isValid);

        return Integer.parseInt(inputValue);
    }
}
