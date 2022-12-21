package com.aplication.basicojava.desafiosurijudge.selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        /*
        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos,
        pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em
        benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida,
        calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

       *=================================*
       | RENDA                   | IR    |
       | 0,00 - 2.000,00         | ISENTO|
       | 2000,01 - 3.000,00      | 8  %  |
       | 3000,01- 4.500,00       | 18 %  |
       | acima 4.500,00          | 28 %  |
       *=================================*

       Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois
       a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo
       fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36
       no total. O valor deve ser impresso com duas casas decimais.

       */
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario > 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00) {
            System.out.println("R$:" + df.format((salario-2000)*0.08));
        }
        else if (salario > 3000.01 && salario <= 4500.00) {
            System.out.println("R$:" + df.format(((salario-3000)*0.18)+80));
        }
        else if (salario > 4500.00) {
            System.out.println("R$:" + df.format(((salario-4500)*0.28)+350));
        }
    }
}
