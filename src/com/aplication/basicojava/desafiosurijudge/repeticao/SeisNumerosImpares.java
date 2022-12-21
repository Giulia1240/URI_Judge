package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
        um valor por linha, inclusive o X ser for o caso.

        Entrada
        A entrada será um valor inteiro positivo.

        Saída
        A saída será uma sequência de seis números ímpares.

        * */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cont = 0;
        while (cont < 6) {
            if (x % 2 == 1) {
                System.out.println(x);
                cont++;
            }
            x++;
        }
    }
}
