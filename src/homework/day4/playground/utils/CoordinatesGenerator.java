package homework.day4.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {

    public static int generateCoordinate() {
        Random random = new Random();

        int a = random.nextInt(79) + 1;

        System.out.printf("CoordinatesGenerator: I have generated point with value: %d", a);
        return a;
    }
}
