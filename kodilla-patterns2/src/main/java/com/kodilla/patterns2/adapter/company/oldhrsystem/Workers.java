package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workesrs = {
            {"67123112345", "John", "Smith1"},
            {"68123112345", "John", "Smith2"},
            {"69123112345", "John", "Smith3"},
            {"70123112345", "John", "Smith4"},
            {"71123112345", "John", "Smith5"},
    };

    private double[] salaries = {
        4500.00,
        4000.00,
        3500.00,
        3000.00,
        5000.00
    };

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workesrs[n][0] + ", " + workesrs[n][1] + ", " +
                workesrs[n][2] + salaries[n];
    }

    public String[][] getWorkesrs() {
        return workesrs;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
