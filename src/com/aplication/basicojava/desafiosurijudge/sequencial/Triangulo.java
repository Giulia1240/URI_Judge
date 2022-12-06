package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        //1- Calcule a área do triangulo

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite um valor para a base do triangulo: ");
        int base = sc.nextInt();

        System.out.println(" Digite um valor para a altura do triangulo: ");
        int altura = sc.nextInt();

        int areaDoTriangulo = base * altura / 2;
        System.out.println(" A area do triangulo é: "+ areaDoTriangulo);

    }


}
