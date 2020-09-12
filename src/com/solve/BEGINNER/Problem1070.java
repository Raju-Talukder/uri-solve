package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        if (x > 0) {
            while (count < 6) {
                if (x % 2 != 0) {
                    count++;
                    System.out.println(x);
                }
                x++;
            }
        }
    }
}
