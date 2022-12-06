package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class DoisPontos {

    public static void main(String[] args) {
        /*
        Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
        p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a
        vírgula, segundo a fórmula
        * */
        DecimalFormat df = new DecimalFormat("0.0000");
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        //segunda opção para calculo
        double distanciaDois = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(df.format(distancia));
        System.out.println(df.format(distanciaDois));

    }
}
