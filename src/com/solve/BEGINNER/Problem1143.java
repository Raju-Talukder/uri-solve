package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            for (int i = 1; i <= n; i++) {
                int sq = (int) Math.pow(i, 2);
                int malti = i * sq;
                System.out.println(i + " " + sq + " " + malti);
            }
        }
    }
}
