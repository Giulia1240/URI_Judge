package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class ParesImparesPositivoNegativo {
    public static void main(String[] args) {
        /*
        Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores
        digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados
        foram negativos.

        Entrada
        O arquivo de entrada contém 5 valores inteiros quaisquer.

        Saída
        Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final
        de linha após cada uma.
         */

        Scanner sc = new Scanner(System.in);

        int contPositivo = 0;
        int contNegativo = 0;
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 5; i++) {
            int valor = sc.nextInt();

            if (valor % 2 == 0) {
                contPar++;
            } else if (valor % 2 == 1) {
                contImpar++;
            } else if (valor > 0) {
                contPositivo++;
            } else if (valor < 0) {
                contNegativo++;
            }
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");
    }
}

