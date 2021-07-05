package thirdTask;

import java.util.Random;

public enum DogsSize {
    SMALL, MEDIUM, BIG;

    private static final DogsSize[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static DogsSize getRandomDodSize() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
