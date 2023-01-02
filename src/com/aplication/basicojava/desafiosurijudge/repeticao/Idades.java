package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        /*
        Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
        O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a
        idade média deste grupo de indivíduos.

        Entrada
        A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo
        for lido.

        Saída
        A saída contém um valor correspondente à média de idade dos indivíduos.

        A média deve ser impressa com dois dígitos após o ponto decimal.
        */
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double n = 0;
        double sum = 0;
        int count = 0;

        for (int i = 0; i <= n; i++) {
            n = sc.nextDouble();
            if (n >= 0) {
                sum += n;
                count++;
            }
        }
        double media = sum / count;
        System.out.println(df.format(media));

    }
}
