package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SalarioComBonus {

    public static void main(String[] args) {
        /*
        Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
        por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
        efetuadas, informar o total a receber no final do mês, com duas casas decimais.

        Entrada
        O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão
        (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das
        vendas efetuadas por este vendedor, respectivamente.

        Saída
        Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
        * */

        Scanner sc = new Scanner(System.in);

        Locale loc = new Locale("en", "US");
        Locale.setDefault(loc);

        Pattern pattern = Pattern.compile("0.00");

        NumberFormat nf = NumberFormat.getNumberInstance(loc);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern(String.valueOf(pattern));

        int qtFuncionario = sc.nextInt();

        Double salary = sc.nextDouble();
        Double totalVendas = sc.nextDouble();
        Double bonus = 0.15;

        Double total = salary + totalVendas * bonus;

        System.out.println("TOTAL" + " = " + "R$ " + df.format(total));

        //outra maneira de ser feito a formatação da decimal
        System.out.println(String.format("TOTAL = R$ %.2f", total));
    }
}
