package com.javarush.task.task24.task2407;

import java.util.LinkedList;
import java.util.List;

public class Util {
    //Util отлично работает со всеми классами Cat, Mouse. А ведь Mouse отличается от Cat.
    public static void printDialog(List<Sayable> pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).say());
        }
    }

    public static List<Pet> getPets() {
        List<Pet> Pets = new LinkedList<>();
        Pets.add(new Cat("Мурзик"));
        Pets.add(new Cat("Васька"));
        Pets.add(new Cat("Кошка"));
        Pets.add(new Mouse());
        Pets.add(new Cat("Томас"));
        return Pets;
    }

    public static List<Sayable> convertPetToSayable(List<Pet> Pets) {
        List<Sayable> result = new LinkedList<>();
        for (Pet Pet : Pets) {
            int i = (int) (Math.random() * 7) - 2;
            result.add(Pet.toSayable(i));
        }
        return result;
    }
}