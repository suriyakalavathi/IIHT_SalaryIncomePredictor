package com.cognizant.salary.validator;

public class SalaryValidator extends Validator
{
	public final int minSalary = 1;
	    @Override
    protected int getMinimum() {
        return this.minSalary;
    }

    @Override
    protected int[] getValues() {
        return new int[0];
    }
}
