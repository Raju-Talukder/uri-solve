package com.solve.BEGINNER;

public class Problem1097 {
    public static void main(String[] args) {
        int p = 7;
        for (int i = 1; i < 10; i += 2) {
            for (int j = p; j >= p-2; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
            p+=2;
        }
    }
}
