package com.aplication.basicojava.desafiosurijudge.selecao;

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Entrada
        A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

        Saída
        Apresente a duração do jogo conforme exemplo abaixo.

       */
        Scanner sc = new Scanner(System.in);
        int hrInicial = sc.nextInt();
        int hrFinal = sc.nextInt();

        if (hrInicial > hrFinal) {
            int resultado = 24-(hrInicial - hrFinal);
            System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
        } else if (hrInicial < hrFinal) {
            int resultado = (hrFinal - hrInicial);
            System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }


    }
}
