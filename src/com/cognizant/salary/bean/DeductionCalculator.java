package com.cognizant.salary.bean;

import java.util.List;

import com.cognizant.salary.predictor.Calculator;

@FunctionalInterface
public interface DeductionCalculator extends Calculator {
    List<DeductionObject> calc(int years, List<IncrementObject> increments, int changeFrequency, float deductionAmount);
}
