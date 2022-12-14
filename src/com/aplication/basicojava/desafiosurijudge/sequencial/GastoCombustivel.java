package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
 /*
    Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em
    uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o
    auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo
    gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter
    distância percorrida e, em seguida, calcular quantos litros seriam necessários. Mostre o valor
    com 3 casas decimais após o ponto.
  */
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        int hrs = sc.nextInt();
        int v = sc.nextInt();

        double km = hrs * v;
        double litro = km/12;

        System.out.println(df.format(litro));

    }
}
