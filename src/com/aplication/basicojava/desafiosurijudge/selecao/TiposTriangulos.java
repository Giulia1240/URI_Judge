package com.aplication.basicojava.desafiosurijudge.selecao;

import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        /*
         Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado
         A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados
         formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

        se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
        se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
        se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
        se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
        se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
        * */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double a2 = a*a;
        double b2=b*b;
        double c2=c*c;

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (a == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a2 == (b2 + c2)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (a2 > (b2 + c2)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (a2 < (b2 + c2)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

    }
}
