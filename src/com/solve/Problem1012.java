package com.solve;

import java.util.Scanner;

public class Problem1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double triangle = (a*c)/2;
        double circle = (3.14159*c*c);
        double trap = ((a+b)/2)*c;
        double square = b*b;
        double rectangle = a*b;

        System.out.printf("TRIANGULO: %.3f\n",triangle);
        System.out.printf("CIRCULO: %.3f\n",circle);
        System.out.printf("TRAPEZIO: %.3f\n",trap);
        System.out.printf("QUADRADO: %.3f\n",square);
        System.out.printf("RETANGULO: %.3f\n",rectangle);
    }
}
