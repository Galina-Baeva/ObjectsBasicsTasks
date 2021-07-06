package thirdTask;

import java.security.SecureRandom;
import java.util.Random;

public class Dog {
    String name;
    DogsSize size;
    int age;

    Random random = new Random();

    public Dog() {
        setRandomName();
        size = DogsSize.getRandomDodSize();
        age = random.nextInt(20);
    }

    public Dog(String name, DogsSize size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        size = DogsSize.getRandomDodSize();
        age = random.nextInt(20);
    }

    public Dog(DogsSize size) {
        setRandomName();
        this.size = size;
        age = random.nextInt(20);
    }

    public Dog(int age) {
        setRandomName();
        size = DogsSize.getRandomDodSize();
        this.age = age;
    }

    void printDog() {
        System.out.println(name + " " + size + " " + age);
    }

    void setRandomName () {
        final String alfa = "abcdefghijklmnopqrstuvwxyz";
        SecureRandom random = new SecureRandom();
        int nameLength = random.nextInt(10);
        StringBuilder stringBuilder = new StringBuilder(nameLength);
        for (int i=0; i<nameLength; i++)
            stringBuilder.append(alfa.charAt(random.nextInt(alfa.length())));
            name = stringBuilder.toString();
    }

}
