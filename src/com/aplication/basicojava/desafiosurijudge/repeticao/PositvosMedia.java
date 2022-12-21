package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PositvosMedia {
    public static void main(String[] args) {
        /*
        Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
        Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
        com um dígito após o ponto decimal.

        Entrada
        A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
        Pelo menos um destes números será positivo.

        Saída
        O primeiro valor de saída é a quantidade de valores positivos.
        A próxima linha deve mostrar a média dos valores positivos digitados.
        */
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        int contador = 0;
        double media = 0;
        double valor;

        for (int i = 0; i < 6; i++) {
            valor = sc.nextDouble();
            if (valor > 0) {
                contador++;
                media += valor;
            }
        }
        media = media / contador;

        System.out.println(contador + " valores positivos");
        System.out.println(df.format(media));

    }
}
