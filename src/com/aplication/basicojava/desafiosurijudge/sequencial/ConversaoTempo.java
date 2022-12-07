package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tempoSegundos = input.nextInt();
        int segundoEmHrs = 3600;
        int hrs = tempoSegundos / segundoEmHrs;
        int minute = (tempoSegundos % segundoEmHrs) / 60;
        int second = (tempoSegundos % segundoEmHrs) % 60;

        System.out.println(hrs + ":" + minute + ":" + second);
    }
}
