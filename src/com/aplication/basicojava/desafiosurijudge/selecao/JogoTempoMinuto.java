package com.aplication.basicojava.desafiosurijudge.selecao;

import java.util.Scanner;

public class JogoTempoMinuto {
    public static void main(String[] args) {
        /*
        Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo.
        A seguir calcule a duração do jogo.

        Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

        Entrada
        Quatro números inteiros representando a hora de início e fim do jogo.

        Saída
        Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
  
        */
        Scanner leitor = new Scanner(System.in);
        int horasInicio = leitor.nextInt();
        int minutosInicio = leitor.nextInt();
        int horasFim = leitor.nextInt();
        int minutosFim = leitor.nextInt();
        int totalHoras = horasFim - horasInicio;
        int totalMinutos = minutosFim - minutosInicio;

        if (totalHoras < 0) {
            totalHoras = 24 + (horasFim - horasInicio);
        }

        if (totalMinutos < 0) {
            totalMinutos = 60 + (minutosFim - minutosInicio);
            totalHoras--;
        }

        String conditions = horasInicio == horasFim && minutosInicio == minutosFim ? "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)" :  "O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)";
        System.out.println(conditions);

    }
}

