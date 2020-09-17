package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, count = 0 ;
        while(true){
            int age = sc.nextInt();
            if(age<0){
                break;
            }else{
                total+=age;
                count++;
            }
        }
        double x = total/(double)count;
        System.out.printf("%.2f\n",x);
    }
}
