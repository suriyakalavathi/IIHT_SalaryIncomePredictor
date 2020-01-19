package com.cognizant.salary.bean;

import java.util.List;

import com.cognizant.salary.predictor.Calculator;

@FunctionalInterface
public interface DeductionCalculator extends Calculator {
   // List<DeductionObject> calc(int years, List<IncrementObject> salary, int changeFrequency, float deductionAmount);
	 List<DeductionObject> calc(int years, List<IncrementObject> inc,int changeFrequency, float deductionAmount);
}
