package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary, new_salary, money_earned;
        int percentage;
        salary = sc.nextDouble();
        if (salary >= 0.00 && salary <= 400.00) {
            percentage = 15;
            calculation_and_print(salary, percentage);
        }else if (salary >= 400.01 && salary <= 800.00) {
            percentage = 12;
            calculation_and_print(salary, percentage);
        }else if (salary >= 800.01 && salary <= 1200.00) {
            percentage = 10;
            calculation_and_print(salary, percentage);
        }else if (salary >= 1200.01 && salary <= 2000.00) {
            percentage = 7;
            calculation_and_print(salary, percentage);
        }else if (salary > 2000.00) {
            percentage = 4;
            calculation_and_print(salary, percentage);
        }
    }
    private static void calculation_and_print(double salary, int percentage) {
        double money_earned;
        double new_salary;
        money_earned = salary * (percentage / 100.00);
        new_salary = salary + money_earned;
        System.out.printf("Novo salario: %.2f\n", new_salary);
        System.out.printf("Reajuste ganho: %.2f\n", money_earned);
        System.out.println("Em percentual: "+ percentage+" %");
    }
}
