package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p =0 ;
        for (int i = 0; i <n; i++) {
            System.out.println((p+1)+" "+(p+2)+" "+(p+3)+" PUM");
            p+=4;
        }
    }
}
