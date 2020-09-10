package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1018 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int hundred = a/100;
        int fifty = (a%100)/50;
        int twenty = ((a%100)%50)/20;
        int ten = (((a%100)%50)%20)/10;
        int five = ((((a%100)%50)%20)%10)/5;
        int two = (((((a%100)%50)%20)%10)%5)/2;
        int one = ((((((a%100)%50)%20)%10)%5)%2)/1;

        System.out.println(a);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");
    }
}
