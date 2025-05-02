package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {
        Random random = new Random();

        int a = random.nextInt(1, 40);

        if (a >= 1 && a <= 9) {
            return "NORTH";
        } else if (a >= 10 && a <= 19) {
            return "SOUTH";
        } else if (a >= 20 && a <= 29) {
            return "WEST";
        } else if (a >= 30 && a <= 39) {
            return "EAST";
        } else {
            return " ";
        }
    }
}

