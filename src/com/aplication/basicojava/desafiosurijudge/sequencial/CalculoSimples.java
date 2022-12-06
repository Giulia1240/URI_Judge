package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        /*
        * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
        *  o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
        * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

        Entrada
        O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
        * respectivamente dois inteiros e um valor com 2 casas decimais.

        Saída
        A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de
        * deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado
        * com 2 casas após o ponto.
        *
        * */

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        int codigoPecaUm = sc.nextInt();
        int num_pc2 = sc.nextInt();
        Double val_pc1 = sc.nextDouble();

        int codigoPecaDois = sc.nextInt();
        int num_pc1 = sc.nextInt();
        Double val_pc2 = sc.nextDouble();


        Double valor= (num_pc1 * val_pc1)+(num_pc2 * val_pc2);


        System.out.println("VALOR A PAGAR: R$ " + decimalFormat.format(valor));
    }
}

