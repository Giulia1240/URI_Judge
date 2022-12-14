package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class QuadradoPares {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N,
        inclusive N, se for o caso.

        Entrada
        A entrada contém um valor inteiro N (5 < N < 2000).

        Saída
        Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

        Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de
        1000000 o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para
        que isso não ocorra.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i += 2) {
            if (5 < n && n < 2000) {
                int resultado = (int) Math.pow(i, 2);
                System.out.println(i + "^2 = " + resultado);

            }
        }

    }
}
