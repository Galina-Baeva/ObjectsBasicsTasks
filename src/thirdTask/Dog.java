package thirdTask;

import java.util.Random;

public class Dog {
    private String name;
    private DogsSize size;
    private int age;

    Random random = new Random();

    public Dog() {
        name = String.valueOf(DogsName.getRandomDogName());
        size = DogsSize.getRandomDodSize();
        age = random.nextInt(20);
    }

    public Dog(String name) {
        this.name = name;
        size = DogsSize.getRandomDodSize();
        age = random.nextInt(20);
    }

    public Dog(DogsSize size) {
        name = String.valueOf(DogsName.getRandomDogName());
        ;
        this.size = size;
        age = random.nextInt(20);
    }

    public Dog(int age) {
        name = String.valueOf(DogsName.getRandomDogName());
        size = DogsSize.getRandomDodSize();
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogsSize getSize() {
        return size;
    }

    public void setSize(DogsSize size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printDog() {
        System.out.println(name + " " + size + " " + age);
    }

}
