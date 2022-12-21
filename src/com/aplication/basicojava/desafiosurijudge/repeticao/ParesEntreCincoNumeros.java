package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) {
    /*
    Faça um programa que leia 5 x inteiros. Conte quantos destes x digitados são pares e
    mostre esta informação.

    Entrada
    O arquivo de entrada contém 5 x inteiros quaisquer.

    Saída
    Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de x pares lidos.

    */
        Scanner sc = new Scanner(System.in);

        int x;
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                cont++;
            }
        }
        System.out.println(cont + " valores pares");
    }
}

