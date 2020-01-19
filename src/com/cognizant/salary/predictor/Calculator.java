package com.cognizant.salary.predictor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cognizant.salary.bean.CalculatorObject;
import com.cognizant.salary.bean.IncrementObject;

public interface Calculator {
    Map<Integer, Integer> changesInYear = new HashMap<Integer, Integer>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
        put(3, 4);
        put(6, 2);
        put(12, 1);
    }};

    static List<CalculatorObject> calculateIncrement(int years, float startingSal, int incFrequency, int incPercentage) {
        List<CalculatorObject> calcs = new ArrayList<>();

        float currentSalary = startingSal;
        int changeFrequency = changesInYear.get(incFrequency);
        for (int i=1; i<=years; i++) {
            float incrementAmount = 0;
                incrementAmount = (currentSalary * incPercentage/100)*changeFrequency;   
            calcs.add(new CalculatorObject(i, currentSalary, changeFrequency, incPercentage, incrementAmount));
            currentSalary += incrementAmount;
         }
        return calcs;
    }

   // static List<CalculatorObject> calculateDeduction(int years, List<IncrementObject> increments, int changeFrequency, float deductionAmount) {
    static List<CalculatorObject> calculateDeduction(int years, List<IncrementObject> increments, int changeFrequency, float deductionAmount) {
        List<CalculatorObject> calcs = new ArrayList<>();
        int frequency = changesInYear.get(changeFrequency);
       // float currentSalary = startingSal;
        for (int i=1; i<=years; i++) {
        	 int deductionPercentage = 0;     
        	 float netSal = increments.get(i-1).getStartingSal(); 
            deductionPercentage += (((deductionAmount*frequency/netSal)*100));
            calcs.add(new CalculatorObject(i, netSal, frequency, deductionPercentage, deductionAmount));           
            netSal-=deductionAmount;
        }
        return calcs;
    }
}
