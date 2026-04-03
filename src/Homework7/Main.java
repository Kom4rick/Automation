package Homework7;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] stroki = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
        String str = scanner.nextLine();
        //zadacha_1(stroki);
        //zadacha_2(stroki);
        //zadacha_3(stroki);
        //zadacha_4(stroki);
        zadacha_5(str);
    }

    public static void zadacha_1(String[] stroki) {
        String dlinnaya = stroki[0];
        String korotkaya = stroki[0];
        for (int i = 1; i < stroki.length; i++) {
            if (dlinnaya.length() < stroki[i].length()) {
                dlinnaya = stroki[i];
            }
            if (korotkaya.length() > stroki[i].length()) {
                korotkaya = stroki[i];
            }
        }
        System.out.println(dlinnaya + " " + dlinnaya.length());
        System.out.println(korotkaya + " " + korotkaya.length());
    }

    public static void zadacha_2(String[] stroki) {
        for (int i = 0; i < stroki.length - 1; i++) {
            for (int j = 0; j < stroki.length - 1 - i; j++) {
                if (stroki[j].length() > stroki[j + 1].length()) {
                    String temp = stroki[j];
                    stroki[j] = stroki[j + 1];
                    stroki[j + 1] = temp;
                }
            }
        }

        for (String s : stroki) {
            System.out.println(s + " " + s.length());
        }
    }

    public static void zadacha_3(String[] stroki) {
        int sum = 0;
        for (int i = 0; i < stroki.length; i++) {
            sum += stroki[i].length();
        }
        for (int i = 0; i < stroki.length; i++) {
            if (stroki[i].length() < sum / 3) {
                System.out.println(stroki[i] + " " + stroki[i].length());
            }
        }
    }

    public static void zadacha_4(String[] stroki) {
        for (int i = 0; i < stroki.length; i++) {
            String str = "";
            for (int j = 0; j < stroki[i].length(); j++) {
                if (!str.contains(valueOf(stroki[i].charAt(j)))){
                    str += valueOf(stroki[i].charAt(j));
                }
            }
            if (stroki[i].equals(str)){
                System.out.println(stroki[i]);
                return;
            }
        }
    }

    public static void zadacha_5(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
