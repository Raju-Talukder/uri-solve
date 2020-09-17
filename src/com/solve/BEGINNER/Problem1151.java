package com.solve.BEGINNER;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1151 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int previous = 0;
        int current = 1;
        int x = Integer.valueOf((br.readLine()).trim());
        if (x > 0 && x < 46) {
            if (x == 1) {
                bw.write("" + previous);
            } else if(x==2){
                bw.write("" + previous + " " + current);
            }else{
                bw.write("" + previous + " " + current + " ");
            }
            for (int i = 0; i <= (x - 3); i++) {
                int newCurrent = (previous + current);
                bw.write(newCurrent + "");
                previous = current;
                current = newCurrent;
                if (i == (x - 3)) {
                } else {
                    bw.write(" ");
                }
                bw.flush();
            }
            bw.write("\n");
            bw.close();
            br.close();
        }
    }
}
