package com.aplication.basicojava.desafiosurijudge.selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaTres {
    public static void main(String[] args) {
        /*
        *Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente
        *  às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente,
        * para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se
        * esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média
        * calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada
        * for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno
        * em exame.".
          No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo
          * aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule
          *  a média (some a pontuação do exame com a média anteriormente calculada e divida por 2).
          * e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno
          * reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou
          * reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: "
          * seguido da média final para esse aluno.
        * */
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;
        int peso4 = 1;

        double media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3) + (n4 * peso4)) / (peso1 + peso2 + peso3 + peso4);

        System.out.println("Media: " + df.format(media));

        if (media >= 7.0) {

            System.out.println("Aluno aprovado.");

        } else if (media >= 5.0 && media <= 6.9) {

            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));

            double mediaExame = (exame + media) / 2.0;

            if (mediaExame >= 5.0) {
                System.out.println("Aluno aprovado.");

            } else if (mediaExame <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(mediaExame));

        } else if (media <= 4.9) {

            System.out.println("Aluno reprovado.");

        }


    }
}
