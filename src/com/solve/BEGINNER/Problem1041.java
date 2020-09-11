package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        x = sc.nextDouble();
        y = sc.nextDouble();
        if(x!=0 && y==0){
            System.out.println("Eixo X");
        }else if(x==0 && y!=0){
            System.out.println("Eixo Y");
        }else if(x == 0 && y ==0){
            System.out.println("Origem");
        }else if(x>0 && y>0){
            System.out.println("Q1");
        }else if(x<0 && y>0){
            System.out.println("Q2");
        }else if(x<0 && y<0){
            System.out.println("Q3");
        }else if(x>0 && y<0){
            System.out.println("Q4");
        }else{

        }
    }
}
