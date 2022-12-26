package com.aplication.basicojava.desafiosurijudge.selecao;

import java.util.Scanner;

public class TempoEvento {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int day_start, day_finish, hr_start, min_start, sec_start, hr_finish, min_finish, sec_finish;
        int seconds, minutes, hour, day;
        String start, finish;

        start = input.next();
        day_start = input.nextInt();
        day_finish = input.nextInt();
        finish = input.next();

        // extrair os dados da string
        hr_start = Integer.parseInt(start.substring(0, 2));
        min_start = Integer.parseInt(start.substring(3, 5));
        sec_start = Integer.parseInt(start.substring(6, 8));
        hr_finish = Integer.parseInt(finish.substring(0, 2));
        min_finish = Integer.parseInt(finish.substring(3, 5));
        sec_finish = Integer.parseInt(finish.substring(6, 8));

        // calcular a diferenca
        seconds = sec_finish - sec_start;
        minutes = min_finish - min_start;
        hour = hr_finish - hr_start;
        day = day_finish - day_start;

        if (seconds < 0) {
            seconds += 60;
            minutes--;
        }

        if (minutes < 0) {
            minutes += 60;
            hour--;
        }

        if (hour < 0) {
            hour += 24;
            day--;
        }

        System.out.println(day + " dia(s)");
        System.out.println(hour + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
    }
}
