package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida.
        Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN),
        ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
        embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá
        imprimir apenas NULL.

        Entrada
        A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de
        teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

        Saída
        Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as
        letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na
        mesma linha.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        String respostaUm = null;
        String respostaDois = null;
        String respostaTres = null;
        String respostaQuatro = null;
        String respostaCinco = null;

        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x == 0) {
                respostaUm = " NULL";
            } else if (x % 2 == 0 && x > 0) {
                respostaDois = "EVEN POSITIVE";
            } else if (x % 2 != 0 && x > 0) {
                respostaTres = " ODD POSITIVE";
            } else if (x % 2 == 0 && x < 0) {
                respostaQuatro = " EVEN NEGATIVE";
            } else if (x % 2 != 0 && x < 0) {
                respostaCinco = " ODD NEGATIVE";

            }
        }
        System.out.println(respostaUm);
        System.out.println(respostaDois);
        System.out.println(respostaTres);
        System.out.println(respostaQuatro);
        System.out.println(respostaCinco);
    }
}
