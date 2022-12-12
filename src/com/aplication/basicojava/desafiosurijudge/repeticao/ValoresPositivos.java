package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class ValoresPositivos {
    public static void main(String[] args) {
        /*
        Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos
        (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

        Entrada
        Seis valores, negativos e/ou positivos.

        Saída
        Imprima uma mensagem dizendo quantos valores positivos foram

        * */
        Scanner sc = new Scanner(System.in);
        double valores;
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            valores = sc.nextDouble();
            if (valores > 0) {
                cont++;

            }
        }
        System.out.println(cont + " valores positivos");
    }
}
