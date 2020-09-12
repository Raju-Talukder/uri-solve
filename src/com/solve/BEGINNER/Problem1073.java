package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 5 && n < 2000) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + "^2" + " = " + (int)Math.pow(i, 2));
                }
            }
        }
    }
}
