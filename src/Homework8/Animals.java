package Homework8;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    private List<String> animalsList = new ArrayList<>();

    public void addAnimal(String animal) {
        animalsList.add(0, animal);
    }

    public void removeAnimal() {
        if (animalsList.isEmpty()) {
            System.out.println("список пуст");
            return;
        }
        animalsList.remove(animalsList.size() - 1);
    }

    public List<String> getAnimalsList() {
        return animalsList;
    }
}
