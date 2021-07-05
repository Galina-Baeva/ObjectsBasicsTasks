package thirdTask;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DogsDemo {
    public static void main(String[] args) {
        int numberOfDogs = 0;
        String listOfDogs = " ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of dogs and dogs' names (divided by space): ");
        listOfDogs = scanner.nextLine();
        String[] listOfDogsParts = listOfDogs.split("\\s");
        numberOfDogs = Integer.parseInt(listOfDogsParts[0]);
        Dog setOfDogs[] = new Dog[numberOfDogs];

        for (int i = 0; i < numberOfDogs; i++) {
            if (i < listOfDogsParts.length - 1) {
                setOfDogs[i] = new Dog(listOfDogsParts[i + 1]);
            } else {
                setOfDogs[i] = new Dog();
            }
        }
        for (int i = 0; i < numberOfDogs; i++) {
            setOfDogs[i].printDog();
        }
        System.out.println("Dogs from the youngest to the oldest");
        Arrays.sort(setOfDogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.age - o2.age;
            }
        });
        for (int i = 0; i < numberOfDogs; i++) {
            setOfDogs[i].printDog();
        }
        System.out.println("Dogs sorted by name");
        Arrays.sort(setOfDogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.name.compareToIgnoreCase(o2.name);
            }
        });
        for (int i = 0; i < numberOfDogs; i++) {
            setOfDogs[i].printDog();
        }

        System.out.println("Dogs from the smallest to the biggest");
        Arrays.sort(setOfDogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.size.compareTo(o2.size);
            }
        });
        for (int i = 0; i < numberOfDogs; i++) {
            setOfDogs[i].printDog();
        }
    }
}
