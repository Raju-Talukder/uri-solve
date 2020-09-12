package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double values[] = new double[6];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextDouble();
            if(values[i]>0){
                count++;
            }
        }
        System.out.println(count+" valores positivos");
    }
}
