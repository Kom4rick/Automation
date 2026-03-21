package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Практика 1
        for (int i = 0; i < 5; i++) {
            int random = new Random().nextInt() + 1;
            System.out.println(Math.abs(random * random));
        }
        //Практика 2
        String[] fruits = {"Yablocko", "Grusha", "Apelsin", "Banan"};
        System.out.println(fruits[1] + " " + fruits[3]);
        System.out.println(fruits.length);
        fruits[2] = "Yablocko";
        System.out.println(fruits[2]);
        //Практика 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite razmer massiva");
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            int random = new Random().nextInt(9) + 1;
            arr[i] = random;
        }
        //3.2
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //3.3
        System.out.println();
        for (int i = 2; i < arr.length; i += 2) {
            arr[i] = Math.abs(arr[i] * arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        //Задача 1
        System.out.println("Vvedite razmer massiva");
        int[] arr1 = new int[scanner.nextInt()];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Vvedite " + i + " element massiva");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }

        //Задачи 2 и 3
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexMinChisla = 0;
        int indexMaxChisla = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
                indexMaxChisla = i;
            }
            if (arr1[i] < min) {
                min = arr1[i];
                indexMinChisla = i;
            }
        }
        System.out.println("Minimalnoe chislo v massive = " + min + ", ego index = " + indexMinChisla);
        System.out.println("Maximalnoe chislo v massive = " + min + ", ego index = " + indexMaxChisla);
        // Задача 4
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nulevih elementov net");
        } else {
            System.out.println("Kol-vo nulevih elementov = " + count);
        }
        //Задача 5
        if (arr1.length % 2 == 0) {
            for (int i = 0; i < arr1.length / 2; i++) {
                int temp = arr1[arr1.length - i - 1];
                arr1[arr1.length - i - 1] = arr1[i];
                arr1[i] = temp;
            }
        } else {
            for (int i = 0; i < (arr1.length - 1) / 2; i++) {
                int temp = arr1[arr1.length - i - 1];
                arr1[arr1.length - i - 1] = arr1[i];
                arr1[i] = temp;
            }
        }
        // Задача 6
        int c = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > c) {
                c = arr1[i];
            } else {
                System.out.println("Massive ne yavlyaetsa vozrastayushei posledovatelnost'yu");
                return;
            }
        }
        System.out.println("Massive yavlyaetsa vozrastayushei posledovatelnost'yu");
    }
}
