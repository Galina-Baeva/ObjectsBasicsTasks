package thirdTask;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class DogsDemo {
    public static void main(String[] args) {
        int numberOfDogs = 0;
        String listOfDogs = " ";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name;
        DogsSize size;
        int age;

        System.out.println("Please enter the number of dogs and dogs' names (divided by space): ");
        listOfDogs = scanner.nextLine();
        String[] listOfDogsParts = listOfDogs.split("\\s");
        numberOfDogs = Integer.parseInt(listOfDogsParts[0]);
        Dog setOfDogs[] = new Dog[numberOfDogs];

        for (int i = 0; i < numberOfDogs; i++) {
            if (i < listOfDogsParts.length - 1) {
                name = listOfDogsParts[i + 1];
            } else {
                name = setRandomName();
            }
            size = DogsSize.getRandomDodSize();
            age = random.nextInt(20);
            setOfDogs[i] = new Dog(name, size, age);
        }
        printAllDogs(setOfDogs);

        System.out.println("Please enter the number of dogs and dogs' ages (divided by space): ");
        listOfDogs = scanner.nextLine();
        String[] listOfDogsAgesParts = listOfDogs.split("\\s");
        numberOfDogs = Integer.parseInt(listOfDogsAgesParts[0]);
        Dog oneMoreSetOfDogs[] = new Dog[numberOfDogs];

        for (int i = 0; i < numberOfDogs; i++) {
            if (i < listOfDogsAgesParts.length - 1) {
                age = Integer.parseInt(listOfDogsAgesParts[i + 1]);
            } else {
                age = random.nextInt(20);
            }
            name = setRandomName();
            size = DogsSize.getRandomDodSize();
            oneMoreSetOfDogs[i] = new Dog(name, size, age);
        }
        printAllDogs(oneMoreSetOfDogs);

        System.out.println("Dogs from the youngest to the oldest");
        sortByAge(oneMoreSetOfDogs);
        printAllDogs(oneMoreSetOfDogs);

        System.out.println("Dogs sorted by name");
        sortByName(oneMoreSetOfDogs);
        printAllDogs(oneMoreSetOfDogs);

        System.out.println("Dogs from the smallest to the biggest");
        sortBySize(oneMoreSetOfDogs);
        printAllDogs(oneMoreSetOfDogs);
    }

    static void printAllDogs(Dog array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i].printDog();
        }
    }

    static String setRandomName() {
        final String alfa = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        SecureRandom random = new SecureRandom();
        int nameLength = random.nextInt(10) + 2;
        StringBuilder stringBuilder = new StringBuilder(nameLength);
        for (int i = 0; i < nameLength; i++)
            stringBuilder.append(alfa.charAt(random.nextInt(alfa.length())));
        return stringBuilder.toString();
    }

    static void sortByAge(Dog[] dog) {
        Arrays.sort(dog, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.age - o2.age;
            }
        });
    }

    static void sortByName(Dog[] dog) {
        Arrays.sort(dog, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.name.compareToIgnoreCase(o2.name);
            }
        });
    }

    static void sortBySize(Dog[] dog) {
        Arrays.sort(dog, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.size.compareTo(o2.size);
            }
        });
    }

}
