package Homework8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        deleteDuplicates(str);

        //Задача 2
        Animals animals = new Animals();
        animals.addAnimal("cow");
        animals.addAnimal("men");
        animals.addAnimal("aaaa");

        List <String> animal = animals.getAnimalsList();
        for(String string : animal){
            System.out.print(string + " ");
        }
        animals.removeAnimal();
        System.out.println();
        List <String> animal1 = animals.getAnimalsList();
        for(String string : animal1){
            System.out.print(string + " ");
        }

        //Задача 3
        String[] strings = {"c", "c", "c"};

        Map<String, Boolean> check = wordMultiple(strings);
        for (Map.Entry<String, Boolean> entry : check.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }

    }

    public static void deleteDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<String> newString = new LinkedHashSet<>();
        String[] parts = str.split(",");

        for (String string : parts) {
            newString.add(string.trim());
        }

        for (String string : newString) {
            sb.append(string + ", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
    }

    public static Map<String, Boolean> wordMultiple(String[] st) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < st.length; i++) {
            if (map.containsKey(st[i])) {
                map.put(st[i], true);
            } else {
                map.put(st[i], false);
            }
        }

        return map;
    }
}


