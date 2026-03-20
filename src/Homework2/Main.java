package Homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Практика 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите месяц");
        int chislo = scan.nextInt();
        switch (chislo) {
            case 12:
            case 1:
            case 2:
                System.out.println("Zima");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Vesna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Leto");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Osen'");
                break;
            default:
                System.out.println("Takogo mesyatsa net(");
        }
        // Практика 2
        int a = 0;
        while (a <= 25) {
            System.out.print(a + " ");
            a++;
        }
        //Практика 3
        for (int i = 2; i <= 20; i++) {
            if ((i % 2 == 0) && i > 10) {
                System.out.println(i);
            }
        }
        // Задача 1
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Vvedite vashe chislo");
        int chislo1 = scan1.nextInt();
        if (chislo1 % 2 == 0){
            System.out.println("Vashe chislo chetnoe");
        } else {
            System.out.println("Vashe chislo nechetnoe");
        }
        // Задача 2
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Vvedite temperatury na ulitse");
        int t = scan2.nextInt();
        if (t > -5){
            System.out.println("Warm");
        } else if (t >= -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }

        //Задача 3
        for (int i = 10; i <=20 ; i++) {
            System.out.println(i * i);
        }

        //Задача 4
        int b = 7;
        while (b < 100) {
            System.out.println(b);
            b += 7;
        }

        //Задача *
        Scanner scan3 = new Scanner(System.in);
        int c;
        while (true) {
            System.out.println("Vvedite tseloe polozhitelnoe chislo");
            c = scan3.nextInt();
            if (c > 0){
                break;
            } else {
                System.out.println("Nekorrektnoe chislo");
            }
        }

        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
