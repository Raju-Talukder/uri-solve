package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>y){
            int temp = x;
            x = y;
            y = temp;
        }
        for (int i = x; i <= y; i++) {
            if(i%13!=0){
                total+=i;
            }
        }
        System.out.println(total);
    }
}
