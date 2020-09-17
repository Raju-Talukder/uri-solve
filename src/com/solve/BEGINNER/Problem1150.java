package com.solve.BEGINNER;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1150 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, n, sec = 0, total = 0;
        a = getIntInput(br);
        while ((n = getIntInput(br)) <= a);
        do {
            total += a;
            a++;
            sec++;
        } while (total < n);
        printValue(bw, String.valueOf(sec));
        printValue(bw, "\n");

        br.close();
        bw.close();
    }

    private static int getIntInput(BufferedReader br) throws IOException {
        int x = Integer.valueOf((br.readLine()).trim());
        return x;
    }

    private static void printValue(BufferedWriter bw, String string) throws IOException {
        bw.write(string);
        bw.flush();

    }
}
