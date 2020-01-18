package com.cognizant.salary.bean;

public class IncrementObject {
    int year;
    float startingSal;
    int numOfIncrements;
    int incrementPercentage;
    float incrementAmount;

    public IncrementObject() {
    }

    public IncrementObject(int year, float startingSal, int numOfIncrements, int incrementPercentage, float incrementAmount) {
        this.year = year;
        this.startingSal = startingSal;
        this.numOfIncrements = numOfIncrements;
        this.incrementPercentage = incrementPercentage;
        this.incrementAmount = incrementAmount;
    }

    public IncrementObject(CalculatorObject calc) {
        this(calc.getYear(), calc.getStartingSal(), calc.getChangeFreq(), calc.getChangePercentage(), calc.getChangeAmount());
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

    public void setStartingSal(int startingSal) {
        this.startingSal = startingSal;
    }

    public int getNumOfIncrements() {
        return numOfIncrements;
    }

    public void setNumOfIncrements(int numOfIncrements) {
        this.numOfIncrements = numOfIncrements;
    }

    public int getIncrementPercentage() {
        return incrementPercentage;
    }

    public void setIncrementPercentage(int incrementPercentage) {
        this.incrementPercentage = incrementPercentage;
    }

    public float getIncrementAmount() {
        return incrementAmount;
    }

    public void setIncrementAmount(float incrementAmount) {
        this.incrementAmount = incrementAmount;
    }

    @Override
    public String toString() {
        return "Increment{" +
                "year=" + year +
                ", startingSal=" + startingSal +
                ", numOfIncrements=" + numOfIncrements +
                ", incrementPercentage=" + incrementPercentage +
                ", incrementAmount=" + incrementAmount +
                '}';
    }
}
