package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
* */
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double a, b, c, pi;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        pi = 3.14159;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        triangulo = a * c * 0.5;
        circulo = pi * c * c;
        trapezio = (a + b) * c * 0.5;
        quadrado = b * b;
        retangulo = a * b;

        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));
    }
}
