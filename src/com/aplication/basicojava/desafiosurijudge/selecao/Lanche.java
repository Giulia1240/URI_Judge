package com.aplication.basicojava.desafiosurijudge.selecao;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Lanche {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código
        de um item e a quantidade deste item. A seguir, calcule e mostre o
        valor da conta a pagar.
        1-Cachorro Quente - R$ 4,00
        2-X-Salada - R$ 4,50
        3-X-Bacon - R$ 5,00
        4-Torrada Simples - R$ 2,00
        5-Refrigerante  - R$ 1,50
        */
        Scanner sc = new Scanner(System.in);
        Scanner scDois = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        int codigo = scDois.nextInt();
        int qtd = scDois.nextInt();
        double preco = 0, total;

        if (codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else if (codigo == 5) {
            preco = 1.50;
        }

        total = preco * qtd;
        System.out.println("Total: R$ " + df.format(total));

        //FAZENDO COM SWITCH CASE
        int codigoDois = sc.nextInt();

        switch (codigoDois) {
            case 1:
                double priceCachorroQuente = 4.00;
                int qtdCachorroQuente = sc.nextInt();
                double valorCachorroQuente = priceCachorroQuente * qtdCachorroQuente;
                System.out.println("Total: R$ " + df.format(valorCachorroQuente));
            case 2:
                double priceXSalada = 4.50;
                int qtdXSalada = sc.nextInt();
                double valorXSalada = priceXSalada * qtdXSalada;
                System.out.println("Total: R$ " + df.format(valorXSalada));
            case 3:
                double priceXBacon = 5.00;
                int qtdXBacon = sc.nextInt();
                double valorXBacon = priceXBacon * qtdXBacon;
                System.out.println("Total: R$ " + df.format(valorXBacon));
            case 4:
                double priceTorradaSimples = 2.00;
                int qtdTorradaSimples = sc.nextInt();
                double valorTorradaSimples = priceTorradaSimples * qtdTorradaSimples;
                System.out.println("Total: R$ " + df.format(valorTorradaSimples));
            case 5:
                double priceRefrigerante = 1.50;
                int qtdRefrigerante = sc.nextInt();
                double valorRefrigerante = priceRefrigerante * qtdRefrigerante;
                System.out.println("Total: R$ " + df.format(valorRefrigerante));
        }


    }
}
