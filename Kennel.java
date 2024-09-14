package AnimalShelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Kennel {
    private List<Animal> animals;

    public Kennel() {
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }


    public void addAnimal(String type, String name, String birthDate) {
        Animal newAnimal = null;

        switch (type.toLowerCase()) {
            case "собака":
                newAnimal = new Dog(name, birthDate);
                break;
            case "кошка":
                newAnimal = new Cat(name, birthDate);
                break;
            case "хомяк":
                newAnimal = new Hamster(name, birthDate);
                break;
            case "лошадь":
                newAnimal = new Horse(name, birthDate);
                break;
            case "верблюд":
                newAnimal = new Camel(name, birthDate);
                break;
            case "осел":
                newAnimal = new Donkey(name, birthDate);
                break;
            default:
                System.out.println("Неизвесный тип животного.");
                return;
        }

        addAnimal(newAnimal);
        System.out.println(type + " имя " + name + " было найдено.");
    }

    public void printAllAnimals() {
        for (Animal animal : animals) {
            animal.printInfo();
            System.out.println("-------------------");
        }
    }

    public void printCommands(String name) {
        Animal animal = findAnimalByName(name);
        if (animal != null) {
            System.out.println("Команда для " + name + ": " + animal.getCommands());
        } else {
            System.out.println("Животное не было найдено.");
        }
    }

    public void trainAnimal(String name, String command) {
        Animal animal = findAnimalByName(name);
        if (animal != null) {
            animal.addCommand(command);
            System.out.println(name + " выучил(а) новую команду: " + command);
        } else {
            System.out.println("Животное не найдено.");
        }
    }

    private Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    public void printAnimalsByBirthDate() {
        animals.sort(Comparator.comparing(Animal::getBirthDate));
        System.out.println("Животные отсортированные по дате рождения::");
        printAllAnimals();
    }
}


