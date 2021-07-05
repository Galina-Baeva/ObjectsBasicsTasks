package thirdTask;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class DogsDemo {
    public static void main(String[] args) {
        int numberOfDogs = 0;
        String listOfDogs = " ";

        String setOfDogs[][] = new String[3][numberOfDogs];

        System.out.println("Please enter the number of dogs and dogs' names/size/ages (divided by space): ");
        Scanner scanner = new Scanner(System.in);
        listOfDogs = scanner.nextLine();
            String[] listOfDogsParts = listOfDogs.split("\\s");
                numberOfDogs = Integer.parseInt(listOfDogsParts[0]);
        for (int i=1; i < listOfDogsParts.length; i ++) {
            setOfDogs[1][i] = listOfDogsParts[i];
            }
        System.out.println(setOfDogs);

    }
}
