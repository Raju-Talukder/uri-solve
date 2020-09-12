package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 1 && n < 1000) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
    }
}
