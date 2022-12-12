package com.aplication.basicojava.desafiosurijudge.selecao;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        /*Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o
        esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes
        foi escolhido, através das três palavras fornecidas.
        * */
        Scanner sc = new Scanner(System.in);
        String animal = sc.next();
        String tipoAnimal = sc.next();
        String tipoalimentacao = sc.next();

        if (animal.equalsIgnoreCase("vertebrado")) {

            if (tipoAnimal.equalsIgnoreCase("ave")) {
                if (tipoalimentacao.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else if (tipoalimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (tipoAnimal.equalsIgnoreCase("mamifero")) {
                if (tipoalimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else if (tipoalimentacao.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }

            }
        } else if (animal.equalsIgnoreCase("invertebrado")) {

            if (tipoAnimal.equalsIgnoreCase("inseto")) {
                if (tipoalimentacao.equalsIgnoreCase("hematofogo")) {
                    System.out.println("pulga");
                } else if (tipoalimentacao.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }

            } else if (tipoAnimal.equalsIgnoreCase("anelideo")) {
                if (tipoalimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println("sanguessuga");
                } else if (tipoalimentacao.equalsIgnoreCase("hematofogo")) {
                    System.out.println("minhoca");
                }

            }
        }
    }
}
