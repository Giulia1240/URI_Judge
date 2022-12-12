package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
    /*
    1.Altere a impressão da tabuada
    2.Imprima do maior para o menor
    */

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int contador = 2; contador <= 10; contador++) {
            int resultado = x * contador;
            System.out.println(contador + "x " + x + " = " + resultado);
        }

    }
}