package com.cognizant.salary.validator;

public class IncrementValidator extends Validator
{

	public final int minIncPercent = 0;
	
    @Override
    protected int getMinimum() {
        return this.minIncPercent;
    }

    @Override
    protected int[] getValues() {
        return new int[0];
    }
}
