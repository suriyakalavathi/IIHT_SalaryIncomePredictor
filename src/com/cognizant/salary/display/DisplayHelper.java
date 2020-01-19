package com.cognizant.salary.display;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.cognizant.salary.bean.DeductionObject;
import com.cognizant.salary.bean.IncrementObject;
import com.cognizant.salary.bean.PredictionObject;

public class DisplayHelper {
    private static final String incrementRptTitle = "a. Increment Report";
    private static final String incrementRptCol1 = "Year";
    private static final String incrementRptCol2 = "Starting Salary";
    private static final String incrementRptCol3 = "Number of Increments";
    private static final String incrementRptCol4 = "Increment %";
    private static final String incrementRptCol5 = "Increment Amount";
    List<String> incrementmentReportHeaders = Arrays.asList(
    		      new String[]{
                  incrementRptCol1,
                  incrementRptCol2,
                  incrementRptCol3,
                  incrementRptCol4,
                  incrementRptCol5
            }
    );

    private static final String deductionRptTitle = "b. Deduction Report";
    private static final String deductionRptCol1 = "Year";
    private static final String deductionRptCol2 = "Starting Salary";
    private static final String deductionRptCol3 = "Number of Deductions";
    private static final String deductionRptCol4 = "Deduction %";
    private static final String deductionRptCol5 = "Deduction Amount";
    List<String> deductionuctionReportHeaders = Arrays.asList(
    				new String[] {
                    deductionRptCol1,
                    deductionRptCol2,
                    deductionRptCol3,
                    deductionRptCol4,
                    deductionRptCol5
            }
    );
    private static final String predictionRptTitle = "c. Prediction Report";
    private static final String predictionRptCol1 = "Year";
    private static final String predictionRptCol2 = "Starting Salary";
    private static final String predictionRptCol3 = "Increment Amount";
    private static final String predictionRptCol4 = "Deduction Amount";
    private static final String predictionRptCol5 = "Salary Growth";
    List<String> predictionReportHeaders = Arrays.asList(
    		new String[]{
    		predictionRptCol1,
    		predictionRptCol2,
    		predictionRptCol3,
    		predictionRptCol4,
    		predictionRptCol5
            }
    );

    RowFormatter rowFormatter = (rName, rColNames, rRows) -> {
        System.out.println(rName);
        rColNames.forEach(name -> System.out.format("%25s", name));
  //      rColNames.forEach(name -> System.out.format("%25s", "-"));
        System.out.println();
        if(!("c. Prediction Report".equalsIgnoreCase(rName))) {
        rRows.forEach(row -> {
            System.out.format("%25d", row.getColumn1());
            System.out.format("%25.2f", row.getColumn2());
            System.out.format("%25d", row.getColumn3());
            System.out.format("%25d", row.getColumn4());
            System.out.format("%25.2f\n", row.getColumn5());
            System.out.println();
        });
        System.out.println();
        }
        else {
        	rRows.forEach(row -> {
                System.out.format("%25d", row.getYear());
                System.out.format("%25.2f", row.getStartingSal());
                System.out.format("%25.2f", row.getIncrementAmount());
                System.out.format("%25.2f", row.getDeductionAmount());
                System.out.format("%25.2f\n", row.getSalaryGrowth());
                System.out.println();
            });
            System.out.println();
        }
    };

    public void incrementReport(List<IncrementObject> incrementrements) {
        List<Row> incrementRows = incrementrements.stream().map(increment -> RowFormatter.constructFrom(increment)).collect(Collectors.toList());
        rowFormatter.display(incrementRptTitle, incrementmentReportHeaders, incrementRows);
    }

    public void deductionReport(List<DeductionObject> deductionuctions) {
        List<Row> deductionRows = deductionuctions.stream().map(deduction -> RowFormatter.constructFrom(deduction)).collect(Collectors.toList());
        rowFormatter.display(deductionRptTitle, deductionuctionReportHeaders, deductionRows);
    }

    public void predictionReport(List<PredictionObject> predictions) {
        List<Row> predictionRows = predictions.stream().map(pred -> RowFormatter.constructFrom(pred)).collect(Collectors.toList());
        rowFormatter.display(predictionRptTitle, predictionReportHeaders, predictionRows);
    }
}
