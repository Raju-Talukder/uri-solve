package com.solve.BEGINNER;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value;
        String values[];
        int n = sc.nextInt();
        int c = 0, r = 0, s = 0, total = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.next();
            if (a >= 1 && a <= 15) {
                if (b.equalsIgnoreCase("C")) {
                    c += a;
                }
                if (b.equalsIgnoreCase("R")) {
                    r += a;
                }
                if (b.equalsIgnoreCase("S")) {
                    s += a;
                }
                total += a;
            }
        }
        double c_c = toDouble((c / (double) total) * 100.00);
        double c_r = toDouble((r / (double) total) * 100.00);
        double c_s = toDouble((s / (double) total) * 100.00);
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.printf("Percentual de coelhos: %.2f %%\n", c_c);
        System.out.printf("Percentual de ratos: %.2f %%\n", c_r);
        System.out.printf("Percentual de sapos: %.2f %%\n", c_s);
    }
    private static double toDouble(double x) {
        DecimalFormat format = new DecimalFormat("#0.00");
        return Double.valueOf(format.format(x));
    }
}
