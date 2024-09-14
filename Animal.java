import AnimalShelter.Pet;

import java.util.ArrayList;
import java.util.List;

// Базовый класс для всех животных
public abstract class Animal {
    private String name;
    private String birthDate;
    private List<String> commands;

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Commands: " + commands);
    }
}

// Класс для собак
class Dog extends Pet {
    public Dog(String name, String birthDate) {
        super(name, birthDate);
    }
}

// Класс для кошек
class Cat extends Pet {
    public Cat(String name, String birthDate) {
        super(name, birthDate);
    }
}

// Класс для хомяков
class Hamster extends Pet {
    public Hamster(String name, String birthDate) {
        super(name, birthDate);
    }
}

// Класс для лошадей
class Horse extends PackAnimal {
    public Horse(String name, String birthDate) {
        super(name, birthDate);
    }
}

// Класс для верблюдов
class Camel extends PackAnimal {
    public Camel(String name, String birthDate) {
        super(name, birthDate);
    }
}

// Класс для ослов
class Donkey extends PackAnimal {
    public Donkey(String name, String birthDate) {
        super(name, birthDate);
    }
}

