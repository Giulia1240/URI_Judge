package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Idade");
        Integer age = sc.nextInt();

        System.out.println("Altura");
        Float heigth = sc.nextFloat();

        System.out.println("Peso");
        Double peso = sc.nextDouble();

        Float imc = Float.valueOf(Math.round(peso / (heigth * heigth)));
        Float imcUm = Float.valueOf(Math.round(peso / (heigth * heigth)));//o metodo round retonar o proximo valor inteiro

        System.out.println(imc);
        System.out.println(nome + " Seu peso atual é  " + peso + " e a altura " + heigth + " , sendo seu imc" + imc);
        System.out.printf(nome + " Seu peso atual é  " + peso + " e a altura " + heigth + " , sendo seu imc: %.2f %n" + imcUm);

        if (imc <= 20) {
            System.out.println("Abaixo do peso");
        } else if (imc > 20 && imc <= 25) {
            System.out.println("Normal");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("SobrePeso");
        } else if (imc > 30 && imc <= 35) {
            System.out.println("Obesidade Moderada");
        } else if (imc > 35 && imc <= 40) {
            System.out.println("Obesidade Severa");
        } else if (imc > 40 && imc <= 50) {
            System.out.println("Obesidade Morbida");
        } else {
            System.out.println("Dados invalidos");
        }

        sc.close();
    }
}
