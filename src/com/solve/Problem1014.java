package com.solve;

import java.util.Scanner;

public class Problem1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        System.out.printf("%.3f km/l\n",(a/b));
    }
}
