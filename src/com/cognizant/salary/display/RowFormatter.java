package com.cognizant.salary.display;

import java.util.List;

import com.cognizant.salary.bean.DeductionObject;
import com.cognizant.salary.bean.IncrementObject;
import com.cognizant.salary.bean.PredictionObject;

@FunctionalInterface
public interface RowFormatter {
    static Row constructFrom(IncrementObject inc) {
        return new Row(inc.getYear(), inc.getStartingSal(), inc.getNumOfIncrements(), inc.getIncrementPercentage(), inc.getIncrementAmount());
    }

    static Row constructFrom(DeductionObject ded) {
        return new Row(ded.getYear(), ded.getStartingSal(), ded.getNumberOfDeductions(), ded.getDeductionPercentage(), ded.getDeductionAmount());
    }

    static Row constructFrom(PredictionObject pred) {
        return new Row(pred.getYear(), pred.getStartingSal(), pred.getIncrementAmount(), pred.getDeductionAmount(), pred.getSalaryGrowth());
    }

    void display(String reportName, List<String> columnNames, List<Row> rows);
}
