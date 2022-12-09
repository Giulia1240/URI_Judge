package com.aplication.basicojava.desafiosurijudge.selecao;

import java.util.Scanner;

public class CoordenadasDeUmPonto {
    public static void main(String[] args) {
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto
        em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre
        um dos eixos cartesianos ou na origem (x = y = 0).
        * */

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (y == 0) {
            System.out.println("Eixo X");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if ((x == 0) & (y == 0)) {
            System.out.println("Origem");
        } else if ((x > 0) & (y > 0)) {
            System.out.println("Q1");
        }else if ((x < 0) & (y > 0)) {
            System.out.println("Q2");
        } else if ((x < 0) & (y < 0)) {
            System.out.println("Q3");
        }  else if ((x > 0) & (y < 0)) {
            System.out.println("Q4");
        }
    }
}
