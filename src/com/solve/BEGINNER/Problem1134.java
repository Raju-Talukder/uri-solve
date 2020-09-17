package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcohol = 0, gasoline = 0, diesel = 0;
        while (true) {
            int x = sc.nextInt();
            if (x == 4) {
                break;
            } else if (x == 1) {
                alcohol++;
            } else if (x == 2) {
                gasoline++;
            } else if (x == 3) {
                diesel++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}
