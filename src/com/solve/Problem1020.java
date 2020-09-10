package com.solve;

import java.util.Scanner;

public class Problem1020 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int year = a/365;
        int month = (a%365)/30;
        int day = ((a%365)%30);

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(day + " dia(s)");
    }
}
