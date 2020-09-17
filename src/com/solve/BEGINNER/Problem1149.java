package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n,b=0;
        a = sc.nextInt();
        while((n=sc.nextInt())<=0);
        for (int i = 1; i <= n; i++) {
            b+=a;
            a++;
        }
        System.out.println(b);
    }
}
