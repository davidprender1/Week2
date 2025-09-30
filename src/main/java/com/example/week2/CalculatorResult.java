package com.example.week2;

public class CalculatorResult {
    private String operation;  // type of operation (add, subtract, etc.)
    private double result;     // result of the calculation
    private String warning;    // warning message (e.g., divide by zero)

    // Constructor for normal operations (no warning)
    public CalculatorResult(String operation, double result) {
        this.operation = operation;
        this.result = result;
        this.warning = null;  // default: no warning
    }

    // Constructor for warnings (e.g., divide by zero, invalid operation)
    public CalculatorResult(String operation, String warning) {
        this.operation = operation;
        this.result = Double.NaN; // NaN = not a number
        this.warning = warning;
    }

    // Getters
    public String getOperation() { return operation; }
    public double getResult() { return result; }
    public String getWarning() { return warning; }
}
