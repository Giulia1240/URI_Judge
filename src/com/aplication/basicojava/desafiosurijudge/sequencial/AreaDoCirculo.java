package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AreaDoCirculo {
    public static void main(String[] args) {
           /*
            A fórmula para calcular a área de uma circunferência é: area = π . raio2.
            Considerando para este problema que π = 3.14159:

            - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

            Entrada
            A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

            Saída
            Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
            com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double).
            Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
            caso contrário, você receberá "Presentation Error".
        * */

        Scanner sc = new Scanner(System.in);

        Locale loc = new Locale("en", "US");
        Locale.setDefault(loc);

        Pattern pattern = Pattern.compile("0.0000");

        NumberFormat nf = NumberFormat.getNumberInstance(loc);
        DecimalFormat decimalFormat = (DecimalFormat) nf;
        decimalFormat.applyPattern(String.valueOf(pattern));

        Double raio = sc.nextDouble();

        /*Double area = 3.14159 * (raio * raio) --> aceito no site, porem outra forma de ser feito
        é utilizando a classe Math */

        Double area = Math.PI * Math.pow(raio, 2);

        String formatacaoArea = decimalFormat.format(area);
        System.out.println("A=" + formatacaoArea);

    }
}
