package com.solve.BEGINNER;

import java.util.Scanner;

public class Problem1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password;
        do {
            password = sc.nextInt();
            if (password == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        }while(password!=2002);
    }
}
