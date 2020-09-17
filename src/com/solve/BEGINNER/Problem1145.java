package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 1 && x < 20 && y > x && y < 100000) {
            for (int i = 1; i <=y; i++) {
                System.out.print(i);
                if(i%x==0){
                    System.out.println("");
                }else{
                    System.out.print(" ");
                }
            }
            if(y%x!=0){
                System.out.println("");
            }

        }
    }
}
