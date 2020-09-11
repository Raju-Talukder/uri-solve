package com.solve.BEGINNER;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c , t;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int sort[]={a,b,c};
        int temp[]={a,b,c};
        Arrays.sort(sort);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
        System.out.println();
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
