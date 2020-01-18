package com.cognizant.salary.validator;

import com.cognizant.salary.predictor.SalaryIncomePredictor;
import com.cognizant.salary.validator.Validator;

public class IncrementFrequencyValidator extends Validator
{
	public final int[] incrementFreq = new int[] { 3, 6, 12 };

    @Override
    protected int getMinimum() {
        return 0;
    }

    @Override
    protected int[] getValues() {
        return this.incrementFreq;
    }
}
