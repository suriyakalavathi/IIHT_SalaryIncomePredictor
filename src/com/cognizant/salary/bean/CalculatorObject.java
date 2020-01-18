package com.cognizant.salary.bean;

public class CalculatorObject {
    private int year;
    private float startingSal;
    private int changeFreq;
    private int changePercentage;
    private float changeAmount;
    
    public CalculatorObject() {
    }

    public CalculatorObject(int year, float startingSal, int changeFreq, int changePercentage, float changeAmount) {
        this.year = year;
        this.startingSal = startingSal;
        this.changeFreq = changeFreq;
        this.changePercentage = changePercentage;
        this.changeAmount = changeAmount;
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

    public int getChangeFreq() {
        return changeFreq;
    }

    public void setChangeFreq(int changeFreq) {
        this.changeFreq = changeFreq;
    }

    public int getChangePercentage() {
        return changePercentage;
    }

    public void setChangePercentage(int changePercentage) {
        this.changePercentage = changePercentage;
    }

    public float getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(float changeAmount) {
        this.changeAmount = changeAmount;
    }

}
