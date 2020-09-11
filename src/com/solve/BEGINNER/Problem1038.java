package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        double price[] = {4.00,4.50,5.00,2.00,1.50};
        if(price.length >= x){
            System.out.printf("Total: R$ %.2f\n",price[x-1]*y);
        }
    }
}
