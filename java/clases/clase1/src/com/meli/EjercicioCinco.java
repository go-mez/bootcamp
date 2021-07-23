package com.meli;

import java.util.Scanner;

public class EjercicioCinco {
    public static boolean contarDigitos(int num, int m, int d) {
        int totalDigitos = 0;
        while(num > 0) {
            if(num%10 == d ) totalDigitos++;
            if(totalDigitos >= m) return true;
            num = num/10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingresa cantidad de numeros a imprimir (n)");
        int n = s.nextInt();
        System.out.println("ingresa el digito que debe contener el numero (d)");
        int d = s.nextInt();
        System.out.println("ingresa la cantidad de veces que se repite el digito (m)");
        int m = s.nextInt();

        int i = 0, j=0;
        while(i < n) {
            if(contarDigitos(j, m, d)) {
                System.out.println(j);
                i++;
            }
            j++;
        }
    }
}
