package exersices.chapter_13;

import java.util.Arrays;

public class Animal {
    public static void main(String[] args) {
        AnimalInterface animals[] = new AnimalInterface[] { new Cat(), new Dog(), new Bird() };
        for (AnimalInterface animal : animals) {
            IO.println(getSoundByName(animal.getClass().toString().split("\\.")[2]));
        }


    }

    public static AnimalInterface getAnimalByName(String name) {
        switch (name.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                return null;
        }
    }

    public static String getSoundByName(String name) {
        AnimalInterface animalInterface = getAnimalByName(name);
        if (null == animalInterface) {
            return null;
        } else {
            return animalInterface.getSound();
        }
    }
}

interface AnimalInterface {
    String getSound();
}

class Cat implements AnimalInterface {
    @Override
    public String getSound() {
        return "Meow";
    }
}

class Dog implements AnimalInterface {
    @Override
    public String getSound() {
        return "Weof";
    }
}

class Bird implements AnimalInterface {
    @Override
    public String getSound() {
        return "Chirp";
    }
}
