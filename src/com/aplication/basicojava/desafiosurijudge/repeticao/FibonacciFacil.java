package com.aplication.basicojava.desafiosurijudge.repeticao;

import java.util.Scanner;

public class FibonacciFacil {
    public static void main(String[] args) {
        /*
        A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci.
        Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores.
        Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa
        série.

        Entrada
        O arquivo de entrada contém um valor inteiro N (0 < N < 46).

        Saída
        Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver
        espaço após o último valor.
                *
        * */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int after=1;
        int before=0;

        for(int i=1;i<=n;i++){
            if(i==n){
                System.out.println(before);
            }
            else{
                System.out.println(before+" ");
                int nextQuest=before+after;
                after=before;
                before=nextQuest;
            }
        }
    }
}
