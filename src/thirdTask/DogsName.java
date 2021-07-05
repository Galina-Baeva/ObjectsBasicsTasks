package thirdTask;

import java.util.Random;

public enum DogsName {
    SHARIK, TUZIK, DRUZHOK, TEDDIE;

    private static final DogsName[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static DogsName getRandomDogName() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
