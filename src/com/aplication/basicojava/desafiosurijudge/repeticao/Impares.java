package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
        um valor por linha, inclusive o X, se for o caso.

        Entrada
        O arquivo de entrada contém 1 valor inteiro qualquer.

        Saída
        Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

        * */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
