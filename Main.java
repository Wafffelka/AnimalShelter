package AnimalShelter;

import AnimalShelter.management.Kennel;
import AnimalShelter.Counter.Counter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kennel kennel = new Kennel();
        Scanner scanner = new Scanner(System.in);

        // Добавим несколько животных для примера
        kennel.addAnimal("собака", "Бобби", "01-01-2020");
        kennel.addAnimal("кошка", "Виски", "05-03-2019");
        kennel.addAnimal("лошадь", "Призрак", "10-10-2015");

        boolean running = true;
        while (running) {
            System.out.println("\nСистема управления питомника приветствует вас!\nНажмите: ");
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Показать всех животных в питомнике");
            System.out.println("3. Показать команды, выполняемые животными");
            System.out.println("4. Обучить животное новой команде");
            System.out.println("5. Выход\n");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try (Counter counter = new Counter()) {
                        System.out.print("Введите тип животного (собака, кошка, хомяк, лошадь, верблюд, осел): ");
                        String type = scanner.nextLine().trim();;
                        System.out.print("Введите имя животного: ");
                        String name = scanner.nextLine().trim();;
                        System.out.print("Введите день рождения (дд-мм-гггг): ");
                        String birthDate = scanner.nextLine().trim();

                        if (!type.isEmpty() && !name.isEmpty() && !birthDate.isEmpty()) {
                            kennel.addAnimal(type, name, birthDate);
                            counter.add();
                        } else {
                            System.out.println("Для добавления нового животного все поля должны быть заполнены.");
                        }
                    } catch (IllegalStateException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 2:
                    kennel.printAllAnimals();
                    break;
                case 3:
                    System.out.print("Введите имя животного: ");
                    String animalName = scanner.nextLine();
                    kennel.printCommands(animalName);
                    break;
                case 4:
                    System.out.print("Введите имя животного: ");
                    animalName = scanner.nextLine();
                    System.out.print("Введите новую команду для изучения: ");
                    String command = scanner.nextLine();
                    kennel.trainAnimal(animalName, command);
                    break;
                case 5:
                    running = false;
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверная опция. Попробуйте ещё раз.");
                    break;
            }
        }

        scanner.close();
    }
}


