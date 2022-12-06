package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {

        //1-Calcule a area do quadrado

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor para os lados do quadrado: ");
        int altura = sc.nextInt();
        int base = altura;

        int areadoQuadrado = altura * base;


        System.out.println("A área do Quadrado é " + areadoQuadrado);
    }
}
