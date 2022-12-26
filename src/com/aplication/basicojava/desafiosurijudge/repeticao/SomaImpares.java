package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros x e y. A seguir, calcule e mostre a soma dos números impares entre eles.

        Entrada
        O arquivo de entrada contém dois valores inteiros.

        Saída
        O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
                * */
        Scanner leitor= new Scanner(System.in);
        int x = leitor.nextInt();
        int y = leitor.nextInt();
        int soma=0;

        if (x < y) {
            for (int i=x+1; i<y; i++) {
                if (i % 2 == 1) {
                    soma+=i;
                }
            }
        }
        else {
            for (int i=y+1; i<x; i++) {
                if (i % 2 == 1) {
                    soma+=i;
                }
            }
        }

        System.out.println(soma);

    }
}
