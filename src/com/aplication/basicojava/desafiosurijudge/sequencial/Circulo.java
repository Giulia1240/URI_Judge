package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
          /*
        1-Calcule a area do Circulo
        2-Calcule o perimetro do Circulo
        3-Determine quantos metros, aproximadamente, uma pessoa percorrerá se der 8 voltas completas
        em torno de um canteiro circular de 2 m de raio
        */
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println(" Digite o valor para raio do Circulo: ");
        Double raio = sc.nextDouble();

        Double area = Math.PI * Math.pow(raio, 2);
        Double perimetro = 2 * Math.PI * raio;
        System.out.println("O valor da área do circulo será: " + decimalFormat.format(area));
        System.out.printf(" O valor do perimetro do circulo será: " + decimalFormat.format(perimetro));

        System.out.println();
        System.out.println("\n Digite quantas voltas serão feitas pelo atleta: ");
        Double voltas = sc.nextDouble();

        Double perimetrototal = perimetro * voltas;
        System.out.printf(" O atleta irá correr um total de metros no circulo de: " + decimalFormat.format(perimetrototal));
    }

}
