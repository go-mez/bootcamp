package com.meli;

import java.util.Scanner;

public class Main {
    public static boolean esPar(int a) {
        return a%2==0;
    }
    public static boolean esImpar(int a) {
        return !esPar(a);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa un valor");
        int a = s.nextInt();
        System.out.println(esPar(a));
        System.out.println(esImpar(a));
        System.out.println("Ingresa otro un valor");
        int b = s.nextInt();
        System.out.println(esPar(b));
        System.out.println(esImpar(b));

        System.out.println( (double) a/b);
        s.close();
        System.out.println((double) a/b);

    }
}
