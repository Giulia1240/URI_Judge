package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int current = sc.nextInt();

        int grade100 = current / 100;
        current -= grade100 * 100;
        int grade50 = current / 50;
        current -= grade50 * 50;
        int grade20 = current / 20;
        current -= grade20 * 20;
        int grade10 = current / 10;
        current -= grade10 * 10;
        int grade5 = current / 5;
        current -= grade5 * 5;
        int grade2 = current / 2;
        current -= grade2 * 2;
        int grade1 = current;

        System.out.println(current);
        System.out.println(grade100 + " nota(s) de R$ 100,00");
        System.out.println(grade50 + " nota(s) de R$ 50,00");
        System.out.println(grade20 + " nota(s) de R$ 20,00");
        System.out.println(grade10 + " nota(s) de R$ 10,00");
        System.out.println(grade5 + " nota(s) de R$ 5,00");
        System.out.println(grade2 + " nota(s) de R$ 2,00");
        System.out.println(grade1 + " nota(s) de R$ 1,00");
    }
}
