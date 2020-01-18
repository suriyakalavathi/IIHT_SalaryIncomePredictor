package com.cognizant.salary.validator;

public class DeductionValidator extends Validator
{
	public final int minDeductionAmt = 0;
	
    @Override
    protected int getMinimum() {
        return this.minDeductionAmt;
    }

    @Override
    protected int[] getValues() {
        return new int[0];
    }
}
