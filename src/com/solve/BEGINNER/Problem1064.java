package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double values[] = new double[6];
        int count = 0;
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextDouble();
        }
        if (checkValue(values)) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] > 0) {
                    count++;
                    total += values[i];
                }
            }
            if (count != 0) {
                System.out.println(count + " valores positivos");
                System.out.printf("%.1f\n", (total / count));
            }
        }
    }
    private static boolean checkValue(double x[]) {
        boolean flag = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
