package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count = 0;
            if (x <= 0 || y <= 0) {
                break;
            }
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            for (int i = x; i <= y; i++) {
                count += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + count);
        }
    }
}
