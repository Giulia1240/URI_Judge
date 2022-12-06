package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
    /*
    Crie um programa do zero e implemente:
    1.Solicite Nome, idade e time e futebol
    2.Imprima todos os dados solicitados*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: \n");
        String name = sc.nextLine();

        System.out.println("Digite seu idade: \n");
        Integer age = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu time de futebol: \n");
        String time = sc.nextLine();

        if (age <= 18) {

            System.out.println(name + " , infelizmente você não poderá participar da partida por fato de ser menor idade");
        } else {
            System.out.println("Seja Bem vindo" + name + "\n ");
            System.out.println("O time " + time + "esta preste a entrar na partida \n");
        }

        sc.close();

    }
}
