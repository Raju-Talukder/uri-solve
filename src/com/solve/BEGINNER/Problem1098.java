package com.solve.BEGINNER;

import java.text.DecimalFormat;

public class Problem1098 {
    public static void main(String[] args) {
        for (double i = 0; i <= 2; i += 0.2) {
            System.out.println("I=" + go(toDouble(i)) + " J=" + go(toDouble(i + 1)));
            System.out.println("I=" + go(toDouble(i)) + " J=" + go(toDouble(i + 2)));
            System.out.println("I=" + go(toDouble(i)) + " J=" + go(toDouble(i + 3)));
        }
    }
    private static String go(double d) {
        if (d == (int) d) {
            return "" + (int) d;
        } else {
            return "" + d;
        }
    }
    private static double toDouble(double x) {
        DecimalFormat format = new DecimalFormat("#0.0");
        return Double.valueOf(format.format(x));
    }
}
