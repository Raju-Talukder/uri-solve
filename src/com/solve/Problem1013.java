package com.solve;

import java.util.Scanner;

public class Problem1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int ab = (a+b+Math.abs(a-b))/2;
        int abc = (ab+c+Math.abs(ab-c))/2;
        System.out.println(abc+" eh o maior");
    }
}
