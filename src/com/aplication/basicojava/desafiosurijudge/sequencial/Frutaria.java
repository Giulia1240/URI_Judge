package com.aplication.basicojava.desafiosurijudge.sequencial;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Frutaria {
    public static void main(String[] args) {
        /*
Dado o string abaixo var str = “Maça, Banana, Kiwi"
Implemente
1.Imprima cada fruta em uma linha separada
2.Utilize a função substr
Bônus: Tente utilizer a função split
*/
        String frutas = "Maça, Banana, Kiwi";
        String frutasQuebra = frutas.replaceAll("\\s", "\n");
        List<String> frutaVetor = Pattern.compile("\\.").splitAsStream(frutasQuebra).collect(Collectors.toList());

        System.out.println(" A ordem das frutas são: ");

        for (String fruta : frutaVetor) {
            System.out.println(fruta);
        }


    }


}
