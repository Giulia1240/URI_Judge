package com.aplication.basicojava.desafiosurijudge.vetor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VetorBásico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = 10;//numeros de posição
        int v[] = new int[n];//vetor
        int i;//valor a ser introduzido dentro do vetor , conforme sua posição

        int soma = 0;
        int menor = v[0];
        int maior = v[0];

        for (i = 0; i < n; i++) {
            System.out.printf("Introduza 10 valores dentro de um vetor e mostre seu menor, maior e valor total: ");
            v[i] = sc.nextInt();

            soma += v[i];

            if (v[i] < menor) {
                menor = v[i];
            } else if (v[i] > maior) {
                maior = v[i];
            }

            if (v[i] == menor) {
                System.out.println(" Menor valor: " + df.format(v[i]));
            } else if (v[i] == maior) {
                System.out.println(" Maior valor: " + df.format(v[i]));
            } else {
                System.out.println(" Valor do vetor: " + df.format(v[i]));
            }
            System.out.println(" Soma total: " + df.format(soma));
        }

    }
}
