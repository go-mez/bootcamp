package com.meli;

import java.util.Scanner;

public class EjercicioUno {
    public static boolean esPar(int a) {
        return a%2==0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingresa un valor: ");
        int n = s.nextInt();
        int i = 0, j=0;
        while(i < n) {
            if(esPar(j)) {
                System.out.println(j);
                i++;
            }
            j++;
        }
        s.close();
    }
}
