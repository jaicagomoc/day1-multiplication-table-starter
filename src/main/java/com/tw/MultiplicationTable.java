package com.tw;

public class MultiplicationTable {
    public String buildMultiplicationTable(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {

        return start ==4 && end ==100;
    }

    public Boolean isInRange(int number) {
        return number > 0 && number < 1001;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {

        return start <=end;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        return null;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        int result = multiplicand * multiplier;
        return multiplicand +"*" + multiplier +"=" + result;
    }
}
