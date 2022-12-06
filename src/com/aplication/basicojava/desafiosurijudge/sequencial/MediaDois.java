package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MediaDois {
    public static void main(String[] args) {
        /*
        Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
        A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a
        nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

        Entrada
        O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

        Saída
         Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto
         decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas,
         não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá
         "Presentation Error".*/
        Scanner sc = new Scanner(System.in);

        Double notaA = sc.nextDouble();
        Double notaB = sc.nextDouble();
        Double notaC = sc.nextDouble();

        Locale loc = new Locale("en", "US");
        Locale.setDefault(loc);

        Pattern pattern = Pattern.compile("0.0");

        NumberFormat nf = NumberFormat.getNumberInstance(loc);
        DecimalFormat decimalFormat = (DecimalFormat) nf;
        decimalFormat.applyPattern(String.valueOf(pattern));

        Double media = ((notaA * 2) + (notaB * 3)+(notaC*5)) / 10;

        System.out.println("MEDIA" + " = " + decimalFormat.format(media));

    }
}
