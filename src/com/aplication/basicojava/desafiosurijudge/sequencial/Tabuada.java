package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
    /*
    1.Altere a impressão da tabuada
    2.Imprima do maior para o menor
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar o número que deseja multiplicar: ");
        int x = scanner.nextInt();

        for (int contador = 10; contador >=0; contador--) {
            int resultado = x * contador;
            System.out.println(resultado);
        }

    }
}