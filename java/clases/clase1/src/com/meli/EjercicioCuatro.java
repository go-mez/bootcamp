package com.meli;

import java.util.Scanner;

public class EjercicioCuatro {
    public static boolean esPrimo(int n) {
        for(int i = 2; i < n; i++) {
            if(n%i == 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingresa un valor: ");
        int n = s.nextInt();
        int i = 0, j=2;
        while(i < n) {
            if(esPrimo(j)) {
                System.out.println(j);
                i++;
            }
            j++;
        }
        s.close();
    }
}
