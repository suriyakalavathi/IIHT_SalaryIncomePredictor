package com.cognizant.salary.predictor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cognizant.salary.bean.CalculatorObject;
import com.cognizant.salary.bean.DeductionCalculator;
import com.cognizant.salary.bean.DeductionObject;
import com.cognizant.salary.bean.IncrementCalculator;
import com.cognizant.salary.bean.IncrementObject;
import com.cognizant.salary.bean.PredictionCalculator;
import com.cognizant.salary.bean.PredictionObject;
import com.cognizant.salary.display.DisplayHelper;
import com.cognizant.salary.userinput.DeductionFrequency;
import com.cognizant.salary.userinput.Deduction;
import com.cognizant.salary.userinput.IncrementFrequency;
import com.cognizant.salary.userinput.Increment;
import com.cognizant.salary.userinput.Prediction;
import com.cognizant.salary.userinput.Salary;

public class SalaryIncomePredictor {

	public void execute() {
		float salary = new Salary().get();
		int incrementPercentage = new Increment().get();
		int incrementFrequency = new IncrementFrequency().get();
		float deductionAmount = new Deduction().get();
		int deductionFrequency = new DeductionFrequency().get();
		int predictionYears = new Prediction().get();

		// Increment Calculation
		IncrementCalculator incrementCalculator = (years, startingSalary, changeFrequency, changePercentage) -> {
			List<CalculatorObject> calcs = Calculator.calculateIncrement(years, startingSalary, changeFrequency,
					changePercentage);
			List<IncrementObject> increments = calcs.stream().map(calc -> new IncrementObject(calc))
					.collect(Collectors.toList());
			return increments;
		};

		List<IncrementObject> increments = incrementCalculator.calc(predictionYears, salary, incrementFrequency,
				incrementPercentage);

		// Deduction Calculation
		DeductionCalculator deductionCalculator = (years, deducts, deductionFreq, changeAmount) -> {
			List<CalculatorObject> calcs = Calculator.calculateDeduction(years, deducts, deductionFrequency,
					changeAmount);
			List<DeductionObject> deductions = calcs.stream().map(calc -> new DeductionObject(calc))
					.collect(Collectors.toList());
			return deductions;
		};

		List<DeductionObject> deductions = deductionCalculator.calc(predictionYears, increments, deductionFrequency,
				deductionAmount);
		// Predition Calculation
		PredictionCalculator predictionCalculator = (incs, deducts) -> {
			List<PredictionObject> salPredictions = new ArrayList<>();
			for (int i = 1; i <= incs.size(); i++) {
				float yearlySal = incs.get(i - 1).getStartingSal();
				float incAmount = incs.get(i - 1).getIncrementAmount();
				float dedAmount = deducts.get(i - 1).getDeductionAmount();
				salPredictions.add(new PredictionObject(i, yearlySal, incAmount, dedAmount,
						PredictionCalculator.generateSalaryGrowth(yearlySal, incAmount, dedAmount)));
			}
			return salPredictions;
		};
		List<PredictionObject> predictions = predictionCalculator.predict(increments, deductions);

		System.out.format("\n\n");

		DisplayHelper displayHelper = new DisplayHelper();
		displayHelper.incrementReport(increments);
		displayHelper.deductionReport(deductions);
		displayHelper.predictionReport(predictions);
	}

	public static void main(String args[]) {
		new SalaryIncomePredictor().execute();
	}
}
