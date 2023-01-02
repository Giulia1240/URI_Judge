package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class DesafioBino {
    public static void main(String[] args) {
        /*

        Bino e Cino são colegas inseparáveis. Bino gosta de criar desafios matemáticos para Cino
        resolver. Desta vez, Bino gerou uma lista de números e perguntou ao Cino quantos números da
        lista são múltiplos de 2, 3, 4 e 5.

        Esse desafio pode parecer simples, porém, quando a lista contém muitos números, Cino se confunde e
        acaba errando alguns cálculos. Para ajudar Cino, faça um programa para resolver o desafio de Bino.

        Entrada
        A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de
        números na lista de Bino.

        A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Bino.

        Saída
        Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação da
        saída nos exemplos, pois ela deve ser seguida rigorosamente.

        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int li;
        int multi2 = 0;
        int multi3 = 0;
        int multi4 = 0;
        int multi5 = 0;

        if (n >= 1 && n <= 1000) {

            for (int i = 1; i <= n; i++) {

                li = sc.nextInt();

                if (li % 2 == 0) {
                    multi2++;
                }
                if (li % 3 == 0) {
                    multi3++;
                }
                if (li % 4 == 0) {
                    multi4++;
                }
                if (li % 5 == 0) {
                    multi5++;
                }
            }
            System.out.println(multi2 + " Multiplo(s) de 2");
            System.out.println(multi3 + " Multiplo(s) de 3");
            System.out.println(multi4 + " Multiplo(s) de 4");
            System.out.println(multi5 + " Multiplo(s) de 5");
        }
    }
}

