package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int values[] = new int[5];
        int pos = 0, neg = 0, even = 0, odd = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
            if (values[i] > 0) {
                pos++;
            }
            if (values[i] < 0) {
                neg++;
            }
            if (values[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}
