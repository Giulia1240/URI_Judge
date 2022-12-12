package com.aplication.basicojava.desafiosurijudge.selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        /*
        Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

        Entrada
        A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

        Saída
        Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.
        *
        * */

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = sc.nextDouble();
        double reajusteSalario = 0;
        double novoSalario = 0;
        int percentual = 0;

        if (salario >= 0 && salario <= 400.00) {

            percentual = 15;
            reajusteSalario = salario * 0.15;
            novoSalario = salario + reajusteSalario;

        } else if (salario >= 400.01 && salario <= 800.00) {

            percentual = 12;
            reajusteSalario = salario * 0.12;
            novoSalario = salario + reajusteSalario;

        } else if (salario >= 800.01 && salario <= 1200.00) {

            percentual = 10;
            reajusteSalario = salario * 0.10;
            novoSalario = salario + reajusteSalario;

        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 7;
            reajusteSalario = salario * 0.07;
            novoSalario = salario + reajusteSalario;

        } else if (salario >= 2000.00) {
            percentual = 4;
            reajusteSalario = salario * 0.04;
            novoSalario = salario + reajusteSalario;

        }

        System.out.println("Novo salario: " + df.format(novoSalario));
        System.out.println("Reajuste ganho: " + df.format(reajusteSalario));
        System.out.println("Em percentual: " + percentual + " %");

    }
}
