package com.meli;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingresa m:");
        int m = s.nextInt();
        System.out.println("ingresa n:");
        int n = s.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(m*i);
        }
    }
}
