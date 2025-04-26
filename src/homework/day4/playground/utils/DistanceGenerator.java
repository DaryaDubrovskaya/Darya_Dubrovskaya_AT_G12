package homework.day4.playground.utils;

import java.util.Random;

public class DistanceGenerator {

    public static int generateDistance() {

        Random random = new Random();

        int a = random.nextInt(39) + 1;

        System.out.printf("DistanceGenerator: I have generated distance with value: %d", a);

        return a;
    }
}
