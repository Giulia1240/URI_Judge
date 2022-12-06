package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Consumo {
    public static void main(String[] args) {
        /*
        Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
        e o total de combustível gasto (em litros).

        Entrada
        O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida
        (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

        Saída
        Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido
        da mensagem "km/l".*/

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int x = sc.nextInt();
        Double y = sc.nextDouble();

        Double consumo = x / y;

        System.out.println(df.format(consumo) + " km/l");


    }
}
