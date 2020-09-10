package com.solve;

import java.util.Scanner;

public class Problem1019 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int hour = a/3600;
        int mint = (a%3600)/60;
        int sec = (a%3600)%60;
        System.out.printf("%d:%d:%d\n",hour,mint,sec);
    }
}
