package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 1;
        while (p != 2) {
            if (p ==1) {
                int count = 0;
                double total = 0;
                while (count != 2) {
                    double x = sc.nextDouble();
                    if (x >= 0 && x <= 10) {
                        total += x;
                        count++;
                    } else {
                        System.out.println("nota invalida");
                    }
                }
                System.out.printf("media = %.2f\n", (total / count));
            }
            System.out.println("novo calculo (1-sim 2-nao)");
            p = sc.nextInt();
        }
    }
}
