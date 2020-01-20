package com.cognizant.salary.bean;

public class PredictionObject {
    int year;
    float startingSal;
    float incrementAmount;
    float deductionAmount;
    int salaryGrowth;

    public PredictionObject() {
    }

    public PredictionObject(int year, float startingSal, float incrementAmount, float deductionAmount, int salaryGrowth) {
        this.year = year;
        this.startingSal = startingSal;
        this.incrementAmount = incrementAmount;
        this.deductionAmount = deductionAmount;
        this.salaryGrowth = salaryGrowth;
    }

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

    public float getIncrementAmount() {
        return incrementAmount;
    }

    public void setIncrementAmount(int incrementAmount) {
        this.incrementAmount = incrementAmount;
    }

    public float getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(float deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public int getSalaryGrowth() {
        return salaryGrowth;
    }

    public void setSalaryGrowth(int salaryGrowth) {
        this.salaryGrowth = salaryGrowth;
    }

    @Override
    public String toString() {
        return "Prediction{" +
                "year=" + year +
                ", startingSal=" + startingSal +
                ", incrementAmount=" + incrementAmount +
                ", deductionAmount=" + deductionAmount +
                ", salaryGrowth=" + salaryGrowth +
                '}';
    }
}
