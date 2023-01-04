package com.aplication.basicojava.desafiosurijudge.vetor;

import java.util.Scanner;

public class TrocaVetor {
    public static void main(String[] args) {
        /*
        Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último,
        o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

        Entrada
        A entrada contém 20 valores inteiros, positivos ou negativos.

        Saída
        Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor
        armazenado naquela posição.

         */
        Scanner sc = new Scanner(System.in);

        int[] n = new int[20];
        int i, aux;
        for (i = 0; i < n.length; i++) {
            int y = sc.nextInt();
            n[i] = y;
        }
        for (i = 0; i < n.length / 2; i++) {
            aux = n[i];
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = aux;
        }
        for (i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] =" + n[i]);
        }
    }
}

