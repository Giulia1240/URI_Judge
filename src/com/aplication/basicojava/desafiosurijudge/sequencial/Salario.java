package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Salario {
    public static void main(String[] args) {
        /*
        Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
        o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e
        o salário do funcionário, com duas casas decimais.

        Entrada
        O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o
        número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada,
        respectivamente.

        Saída
        Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes
        e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.*/

        Scanner sc = new Scanner(System.in);

        Locale loc = new Locale("en", "US");
        Locale.setDefault(loc);

        Pattern pattern = Pattern.compile("0.00");

        NumberFormat nf = NumberFormat.getNumberInstance(loc);
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern(String.valueOf(pattern));

        int qtFuncionario = sc.nextInt();
        int hrs = sc.nextInt();
        Double valorHoras = sc.nextDouble();

        Double salary = hrs * valorHoras;

        System.out.println("NUMBER" + " = " + qtFuncionario);
        System.out.println("SALARY" + " = " + " U$ " + df.format(salary));

        //outra maneira de ser feito a formatação da decimal
        System.out.println(String.format("SALARY = U$ %.2f", salary));
    }
}
