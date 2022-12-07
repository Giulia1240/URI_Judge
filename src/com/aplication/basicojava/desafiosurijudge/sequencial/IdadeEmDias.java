package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

        /*
        Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
        Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
        Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
        * */

        int year, age, mounth, day;
        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();

        year = age / 365;
        mounth = (age % 365) / 30;
        day = (age % 365) % 30;

        System.out.println(year + " ano(s)");
        System.out.println(mounth + " mes(es)");
        System.out.println(day + " dia(s)");


    }
}
