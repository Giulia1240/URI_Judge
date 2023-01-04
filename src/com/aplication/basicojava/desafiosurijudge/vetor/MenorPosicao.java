package com.aplication.basicojava.desafiosurijudge.vetor;

import java.util.Scanner;

public class MenorPosicao {
    public static void main(String[] args) {
        /*
        Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. A seguir,
        leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição
        dentro do vetor, mostrando esta informação.

        Entrada
        A primeira linha de entrada contem um único inteiro N (1 < N < 1000), indicando o número de e
        lementos que deverão ser lidos em seguida para o vetor X[N] de inteiros. A segunda linha contém
        cada um dos N valores, separados por um espaço. Vale lembrar que nenhuma entrada haverá números
        repetidos.

        Saída
        A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido
        na entrada. A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do
        vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.
                * */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int menor = 0, pMenor = 0;

        for (int i = 0; i < n; i++) {

            // x[i] = (int) Math.round(Math.random()*100); -->caso deseja numeros aleatorios
            x[i] = sc.nextInt();

            if (i == 0) {
                menor = x[i];
                pMenor = i;
            } else if (x[i] < menor) {
                menor = x[i];
                pMenor = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + pMenor);


    }
}
