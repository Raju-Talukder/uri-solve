package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary, tax = 0;
        salary = sc.nextDouble();
        if (salary >= 0.0 && salary <= 2000.00) {
            System.out.println("Isento");
        } else if (salary >= 2000.01 && salary <= 3000.00) {
            tax += (salary - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", tax);
        } else if (salary >= 3000.01 && salary <= 4500.00) {
            tax += 1000.00 * 0.08;
            tax += (salary - 3000) * 0.18;
            System.out.printf("R$ %.2f\n", tax);
        } else if (salary > 4500.00) {
            tax += 1000.00 * 0.08;
            tax += 1500.00 * 0.18;
            tax += (salary - 4500.00) * 0.28;
            System.out.printf("R$ %.2f\n", tax);
        }
    }
}
