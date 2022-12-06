package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
       /*
         1.Altere a impressão
         2.Imprima os números pares
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

