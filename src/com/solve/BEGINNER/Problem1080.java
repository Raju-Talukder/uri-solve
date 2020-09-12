package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int values[] = new int[100];
        int value = 0, index = 0;
        for (int i = 0; i < 100; i++) {
            values[i] = sc.nextInt();
            if (values[i] > value) {
                value = values[i];
                index = i;
            }
        }
        System.out.println(value);
        System.out.println((index + 1));
    }
}
