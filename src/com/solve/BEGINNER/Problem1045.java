package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a > 0 && b > 0 && c > 0) {
            double abc[] = sortDecreasing(new double[]{a, b, c});
            a = abc[0];
            b = abc[1];
            c = abc[2];
            if (a >= (b + c)) {
                System.out.println("NAO FORMA TRIANGULO");
            }
            else if ((a * a) == ((b * b) + (c * c))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            else if ((a * a) > ((b * b) + (c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if ((a * a) < ((b * b) + (c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c  && c==a) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
    private static double[] sortDecreasing(double[] par) {
        for (int i = 0; i < par.length; i++) {
            for (int j = 0; j < par.length - 1; j++) {
                if (par[j] < par[j + 1]) {
                    double temp = par[j];
                    par[j] = par[j + 1];
                    par[j + 1] = temp;
                }
            }
        }
        return par;
    }
}
