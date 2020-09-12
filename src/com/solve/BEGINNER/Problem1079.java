package com.solve.BEGINNER;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2, b = 3, c = 5;
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            System.out.println(toDouble(((x * a) + (y * b) + (z * c)) / (a + b + c)));
        }
    }
    private static double toDouble(double x) {
        DecimalFormat format = new DecimalFormat("#0.0");
        return Double.valueOf(format.format(x));
    }
}
