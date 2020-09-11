package com.solve.AdHoc;

import java.util.Scanner;

public class Problem1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x, y, answer;
        while (sc.hasNext()) {
            x = sc.nextLong();
            y = sc.nextLong();
            answer = x ^ y;
            System.out.println(answer);
        }
    }
}
