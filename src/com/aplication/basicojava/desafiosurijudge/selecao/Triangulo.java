package com.aplication.basicojava.desafiosurijudge.selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Triangulo {
    public static void main(String[] args) {
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um
        ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se
        está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        *
        * */
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();


        if (((Math.abs(B - C) < A) & (A < B + C)) & ((Math.abs(A - C) < B) & (B < A + C)) & ((Math.abs(A - B) < C) & (C < A + B))) {

            double perimetro = A + B + C;
            System.out.println("Perimetro = " + df.format(perimetro));
        } else {
            double area = (A * B) * C / 2;
            System.out.println("Area = " + df.format(area));
        }
    }
}
