package thirdTask;

import java.util.Random;

public class Dog {
    private String name;
    private DogsSize size;
    private int age;

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
        if (size.equals(null)) {
            size = DogsSize.getRandomDodSize();
        } else {
            this.size = size;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age != 0) {
            this.age = age;
        } else {
            Random random = new Random();
            age = random.nextInt(20);
        }
    }

}
