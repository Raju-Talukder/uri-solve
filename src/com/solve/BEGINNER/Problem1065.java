package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int values[] = new int[5];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
            if(values[i]%2==0){
                count++;
            }
        }
        System.out.println(count+" valores pares");
    }
}
