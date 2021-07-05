package thirdTask;

import java.util.Scanner;

public class DogsDemo {
    public static void main(String[] args) {
        int numberOfDogs = 0;
        String listOfDogs = " ";

        String setOfDogs[][] = new String[3][numberOfDogs];

        System.out.println("Please enter the number of dogs: ");
        Scanner scanner = new Scanner(System.in);
        numberOfDogs = scanner.nextInt();

        System.out.println("Please enter dogs' names, size and ages (divided by space): ");
        Scanner scanner2 = new Scanner(System.in);
        listOfDogs = scanner2.nextLine();
            String[] listOfDogsParts = listOfDogs.split("\\s");
            for (int i=0; i < listOfDogsParts.length; i ++) {

            }


    }
}
