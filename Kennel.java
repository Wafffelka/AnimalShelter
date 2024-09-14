package AnimalShelter;

import java.util.ArrayList;
import java.util.List;

class Kennel {
    private List<Animal> animals;

    public Kennel() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAllAnimals() {
        for (Animal animal : animals) {
            animal.printInfo();
            System.out.println("-------------------");
        }
    }
}

