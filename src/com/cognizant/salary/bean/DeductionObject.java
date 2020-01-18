package com.cognizant.salary.bean;

public class DeductionObject {
    int year;
    float startingSal;
    int numberOfDeductions;
    int deductionPercentage;
    float deductionAmount;

    public DeductionObject() {
    }

    public DeductionObject(int year, float startingSal, int numberOfDeductions, int deductionPercentage, float deductionAmount) {
        this.year = year;
        this.startingSal = startingSal;
        this.numberOfDeductions = numberOfDeductions;
        this.deductionPercentage = deductionPercentage;
        this.deductionAmount = deductionAmount;
    }

    public DeductionObject(CalculatorObject calc) {
    	 this(calc.getYear(), calc.getStartingSal(), calc.getChangeFreq(), calc.getChangePercentage(), calc.getChangeAmount());    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getStartingSal() {
        return startingSal;
    }

    public void setStartingSal(float startingSal) {
        this.startingSal = startingSal;
    }

    public int getNumberOfDeductions() {
        return numberOfDeductions;
    }

    public void setNumberOfDeductions(int numberOfDeductions) {
        this.numberOfDeductions = numberOfDeductions;
    }

    public int getDeductionPercentage() {
        return deductionPercentage;
    }

    public void setDeductionPercentage(int deductionPercentage) {
        this.deductionPercentage = deductionPercentage;
    }

    public float getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(float deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    @Override
    public String toString() {
        return "DeductionObject{" +
                "year=" + year +
                ", startingSal=" + startingSal +
                ", numberOfDeductions=" + numberOfDeductions +
                ", deductionPercentage=" + deductionPercentage +
                ", deductionAmount=" + deductionAmount +
                '}';
    }
}
