package com.aplication.basicojava.desafiosurijudge.sequencial;

public class Trapezio {

    public static void main(String[] args) {
 /*
        1-Calcule a area do trapezio
        2-Calcule o perimetro do trapezio
        */
        System.out.println(" Digite a base menor ");
        double baseMenor = 9.0;
        System.out.println("\n Digite a base maior ");
        double baseMaior = 24.0;
        System.out.println("\n Digite a altura");
        double alturaH = 15.0;

        double area=(baseMaior+baseMenor)*alturaH/2;
        double perimetro=baseMaior+baseMenor+alturaH;

        System.out.println("A área do trapezio será : " + area);
        System.out.println("O perimetro do trapezio será : " + perimetro);
    }
}
