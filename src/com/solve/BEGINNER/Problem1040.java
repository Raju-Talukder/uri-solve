package com.solve.BEGINNER;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, n5, average, recalculate;
        int a = 2, b = 3, c = 4, d = 1;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        average = toDouble(((n1 * a) + (n2 * b) + (n3 * c) + (n4 * d)) / (a + b + c + d));
        System.out.println("Media: " + average);
        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if(average >=5.00 && average <= 6.9){
            System.out.println("Aluno em exame.");
            n5 = sc.nextDouble();
            System.out.println("Nota do exame: " + n5);
            recalculate = toDouble((n5 + average) / 2);
            if (recalculate >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (recalculate <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + recalculate);
        }
    }
    private static double toDouble(double x){
        DecimalFormat format = new DecimalFormat("#0.0");
        return Double.valueOf(format.format(x));
    }
}
