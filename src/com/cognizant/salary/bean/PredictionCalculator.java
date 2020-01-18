package com.cognizant.salary.bean;

import java.util.List;

@FunctionalInterface
public interface PredictionCalculator {
    static float generateSalaryGrowth(float salary, float increment, float deduction) {
        return (increment - deduction) * 100 / salary;
    }
    List<PredictionObject> predict(List<IncrementObject> increments, List<DeductionObject> deductions);
}
