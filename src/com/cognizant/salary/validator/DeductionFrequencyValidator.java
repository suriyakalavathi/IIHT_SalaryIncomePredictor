package com.cognizant.salary.validator;

public class DeductionFrequencyValidator extends Validator
{
	public final int[] deductFrequency = new int[] { 3, 6, 12 };
	
    @Override
    protected int getMinimum() {
        return 0;
    }

    @Override
    protected int[] getValues() {
        return this.deductFrequency;
    }
}
