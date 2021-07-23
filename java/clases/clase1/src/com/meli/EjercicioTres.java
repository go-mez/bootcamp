package com.meli;

import java.util.Scanner;

public class EjercicioTres {
    public static boolean esPrimo(int n) {
        for(int i = 2; i < n; i++) {
            if(n%i == 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int n = s.nextInt();
        if(esPrimo(n)) System.out.println("Es primo");
        else System.out.println("No es primo");
    }
}
