package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão
        resto igual a 2.

        Entrada
        A entrada contém um valor inteiro N (N < 10000).

        Saída
        Imprima todos valores que quando divididos por N dão resto = 2, um por linha
        *
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
    }
}
