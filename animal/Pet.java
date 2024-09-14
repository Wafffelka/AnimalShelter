package AnimalShelter;

import AnimalShelter.AnimalType.Cat;
import AnimalShelter.AnimalType.Dog;
import AnimalShelter.AnimalType.Hamster;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet extends Animal {
    public Pet(String name, String birthDate) {
        super(name, birthDate);
    }

    private static List<Dog> dogs = new ArrayList<>();
    private static List<Cat> cats = new ArrayList<>();
    private static List<Hamster> hamsters = new ArrayList<>();

    public static void addDog(Dog dog) {
        dogs.add(dog);
    }

    public static void addCat(Cat cat) {
        cats.add(cat);
    }

    public static void addHamster(Hamster hamster) {
        hamsters.add(hamster);
    }
}
