package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class Maior {
    public static void main(String[] args) {

        DecimalFormat df= new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int i = a - b - c;
        int MaiorAB = a + b + Math.abs(a - b) / 2;
        MaiorAB = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;

        System.out.println(df.format(MaiorAB) + " eh o maior valor ");

    }
}
