package com.cognizant.salary.display;

public class Row {
	private int column1;
	private float column2;
	private int column3;
    private int column4;
    private float column5;
	private int year;
	private float startingSal;
	private float incrementAmount;
	private float deductionAmount;
	private int salaryGrowth;

    public Row() {
    }

    public Row(int column1, float column2, int column3, int column4, float column5) {
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
        this.column4 = column4;
        this.column5 = column5;
    }

    public Row(int year, float startingSal, float incrementAmount, float deductionAmount, int salaryGrowth) {
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

	public void setIncrementAmount(float incrementAmount) {
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

	public int getColumn1() {
        return column1;
    }

    public void setColumn1(int column1) {
        this.column1 = column1;
    }

    public float getColumn2() {
        return column2;
    }

    public void setColumn2(int column2) {
        this.column2 = column2;
    }

    public int getColumn3() {
        return column3;
    }

    public void setColumn3(int column3) {
        this.column3 = column3;
    }

    public int getColumn4() {
        return column4;
    }

    public void setcolumn4(int column4) {
        this.column4 = column4;
    }

    public float getColumn5() {
        return column5;
    }

    public void setColumn5(float column5) {
        this.column5 = column5;
    }

    @Override
    public String toString() {
        return "TalbeRowFormatter{" +
                "column1=" + column1 +
                ", column2=" + column2 +
                ", column3=" + column3 +
                ", column4=" + column4 +
                ", column5=" + column5 +
                ", year=" + year +
                ", startingSal=" + startingSal +
                ", incrementAmount=" + incrementAmount +
                ", deductionAmount=" + deductionAmount +
                ", salaryGrowth=" + salaryGrowth +
                '}';
    }
}
