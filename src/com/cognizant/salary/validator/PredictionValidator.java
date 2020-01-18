package com.cognizant.salary.validator;

public class PredictionValidator extends Validator
{
	public final int[] predictionYears = new int[] { 5, 10, 20, 30, 50 };
    @Override
    protected int getMinimum() {
        return 0;
    }

    @Override
    protected int[] getValues() {
        return this.predictionYears;
    }
}
