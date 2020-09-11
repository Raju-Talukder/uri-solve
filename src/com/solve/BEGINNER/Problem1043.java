package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, perimeter, area_trapezium;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimeter);
        } else {
            area_trapezium = ((a + b) / 2) * c;
            System.out.printf("Area = %.1f\n", area_trapezium);
        }
    }

}
