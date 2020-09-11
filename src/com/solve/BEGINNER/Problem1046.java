package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, duration = 0;
        start = sc.nextInt();
        end = sc.nextInt();
        if (start <= 24 && end <= 24 && start >= 0 && end >= 0) {
            if (end > start) {
                duration = end - start;
            } else if (end < start || end == start) {
                duration = (end - start) + 24;
            }
            System.out.println("O JOGO DUROU "+duration+" HORA(S)");
        }
    }
}
