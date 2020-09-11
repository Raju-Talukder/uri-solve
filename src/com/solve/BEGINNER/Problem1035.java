package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if (compareTo(b, c) && compareTo(d, a) && compareTo(sum(c, d), sum(a, b))
                && checkPositive(c) && checkPositive(d) && checkEven(a)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
    private static boolean compareTo(int x, int y) {
        return x > y;
    }
    private static int sum(int x, int y) {
        return x + y;
    }
    private static boolean checkPositive(int x) {
        return x > 0;
    }
    private static boolean checkEven(int x) {
        return x % 2 == 0;
    }
}
