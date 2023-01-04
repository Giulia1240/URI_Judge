package com.aplication.basicojava.desafiosurijudge.vetor;

import java.util.Scanner;

public class SubstituiçãoVetorI {
    public static void main(String[] args) {
        /*Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e
        negativos do vetor X por 1. Em seguida mostre o vetor X.

        Entrada
        A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

        Saída
        Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor
        armazenado naquela posição.
                *
        * */
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        n[0] = (int) Math.round(Math.random() * 10);
        for (int i = 1; i < 10; i++) {
            n[i] = n[i - 1] * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }

    }
}
