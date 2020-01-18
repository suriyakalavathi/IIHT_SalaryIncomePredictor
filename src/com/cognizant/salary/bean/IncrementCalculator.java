package com.cognizant.salary.bean;

import java.util.List;

import com.cognizant.salary.predictor.Calculator;

@FunctionalInterface
public interface IncrementCalculator extends Calculator {
    List<IncrementObject> calc(int years, float startSalary, int incFrequency, int incPercentage);
}
