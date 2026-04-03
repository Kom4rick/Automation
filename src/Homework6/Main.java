package Homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        first(2);
        second(3);
        third();
        fourth();
    }

    public static int first(int a) {
        int i = 0;
        try {
            i = a / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return i;
    }

    public static int second(int a) {
        int b = 0;
        try {
            a = b / 0;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public static void third() {
        Object o = "abc";
        try {
            Integer num = (Integer) o;
        } catch (ArithmeticException | ClassCastException e) {
            e.printStackTrace();
        }
    }

    public static void fourth() {
        Scanner scanner = new Scanner(System.in);
        try {
            scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
