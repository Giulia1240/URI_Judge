package com.aplication.basicojava.desafiosurijudge.vetor;

import java.util.Scanner;

public class PreenchimentoVetor {
    public static void main(String[] args) {
        /*
    Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10].
    Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor
    lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

    Entrada
    A entrada contém um valor inteiro (V<=50).

    Saída
    Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado
    na posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V.
    *
        * */
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int vetor[] = new int[n];
        int a[] = new int[n];
        int i, menor, aux;

        for (i = 0; i < n; i++) {
//          int x = (int) Math.round(Math.random() * 100);
            int x = sc.nextInt();
            vetor[i] = x;
            a[i] = vetor[i];
        }

        //Ordenado
        for (i = 0; i < (n - 1); i++) {
            menor = i;
            for (int j = (i + 1); j < n; j++) {
                if (a[j] < a[menor]) {
                    menor = j;
                }

                aux = a[i];
                a[i] = a[menor];
                a[menor] = aux;
            }
            System.out.println("Menor valor:" + a[i] + " " + "Posição:" + i);
        }
    }
}
