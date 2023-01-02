package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class FelizNatal {
    public static void main(String[] args) {
        /*

        Você fica tão feliz no natal que tem vontade de gritar para todo mundo: "Feliz natal!!".
        Pra colocar toda essa felicidade pra fora, você montou um programa que, colocado um índice I
        de felicidade, seu grito de natal é mais animado.

        Entrada
        A entrada é composta por um inteiro I (1 < I ≤ 104) que representa o índice de felicidade.

        Saída
        A saída é composta pela frase "Feliz natal!", sendo repetidas I vezes a última letra a da frase.
        Uma quebra de linha é necessária após a impressão da frase.
        *
        * */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String n = "a";
        for (int count = 1; count < i; count++) {
            n += "a";
        }
        System.out.println("Feliz nat"+n+"l!");
    }
}
