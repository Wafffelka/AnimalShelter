package AnimalShelter;

import AnimalShelter.AnimalType.Camel;
import AnimalShelter.AnimalType.Donkey;
import AnimalShelter.AnimalType.Horse;

import java.util.ArrayList;
import java.util.List;

public abstract class PackAnimal extends Animal {
    public PackAnimal(String name, String birthDate) {
        super(name, birthDate);
    }

    private static List<Horse> horses = new ArrayList<>();
    private static List<Camel> camels = new ArrayList<>();
    private static List<Donkey> donkeys = new ArrayList<>();

    public static void addHorse(Horse horse) {
        horses.add(horse);
    }

    public static void addCamel(Camel camel) {
        camels.add(camel);
    }

    public static void addDonkey(Donkey donkey) {
        donkeys.add(donkey);
    }
}
