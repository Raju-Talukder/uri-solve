package com.solve.BEGINNER;

import java.io.*;

public class Problem1146 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x;
        while ((x = getIntInput(br)) != 0) {
            for (int i = 1; i < x; i++) {
                printValue(bw, i + " ");
            }
            printValue(bw, x+"\n");
        }
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
