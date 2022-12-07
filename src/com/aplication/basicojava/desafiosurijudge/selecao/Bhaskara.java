package com.aplication.basicojava.desafiosurijudge.selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Bhaskara {
    public static void main(String[] args) {
        /*
        Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de bhaskara.
        Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
        caso haja uma divisão por 0 ou raiz de numero negativo.*/

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2.0) - 4 * a * c;

        if ((a == 0) | (delta < 0)) {
            System.out.println("Impossivel calcular");
        } else {
            double bhaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
            double bhaskara2 = (-b - Math.sqrt(delta)) / (2 * a);

            //2° forma de ser feito o calculo :
            double bhaskara3 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double bhaskara4 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            System.out.println("R2 = " + df.format(bhaskara1));
            System.out.println("R1 = " + df.format(bhaskara2));

        }
    }
}
