package thirdTask;

import java.util.Random;

public class Dog {
    String name;
    DogsSize size;
    int age;

    public Dog(String name, DogsSize size, int age) {
        this.name = name;
        this.size = size;
        this.age = age;
    }


    void printDog() {
        System.out.println(name + " " + size + " " + age);
    }


}
