package AnimalShelter;

public class Main {
    public static void main(String[] args) {
        Kennel kennel = new Kennel();

        Dog dog1 = new Dog("Buddy", "01-01-2020");
        dog1.addCommand("Sit");
        dog1.addCommand("Fetch");

        Cat cat1 = new Cat("Whiskers", "05-03-2019");
        cat1.addCommand("Jump");

        Horse horse1 = new Horse("Spirit", "10-10-2015");
        horse1.addCommand("Gallop");

        kennel.addAnimal(dog1);
        kennel.addAnimal(cat1);
        kennel.addAnimal(horse1);

        kennel.printAllAnimals();
    }
}

