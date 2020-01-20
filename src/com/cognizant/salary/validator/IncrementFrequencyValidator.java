package com.cognizant.salary.validator;

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
