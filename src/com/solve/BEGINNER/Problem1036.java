package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x = nonNegative(a, b, c);
        double y = nonZero(a);
        if (y != 0 && x >= 0) {
            double r1 = (-b+Math.sqrt(x))/y;
            double r2 = (-b-Math.sqrt(x))/y;
            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
    private static double nonZero(double a) {
        return 2 * a;
    }
    private static double nonNegative(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }
}
