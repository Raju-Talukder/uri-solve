package com.solve;

import java.util.Scanner;

public class Problem1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double sal = ((4.0/3)*3.14159)*(a*a*a);
        System.out.printf("VOLUME = %.3f\n",sal);
    }
}
