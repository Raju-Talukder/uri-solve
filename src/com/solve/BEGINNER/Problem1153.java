package com.solve.BEGINNER;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String value = br.readLine().trim();
        int x = Integer.valueOf(value);
        if (x > 0 && x < 13) {
            bw.write(getFactorial(x)+"\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }
    private static int getFactorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * getFactorial(x - 1);
        }
    }
}
