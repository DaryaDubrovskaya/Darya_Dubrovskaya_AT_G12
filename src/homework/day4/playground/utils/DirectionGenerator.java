package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String str;

    public static String generateDirection() {

        Random random = new Random();

        int a = random.nextInt(39) + 1;

        if (a >= 1 && a <= 9) {
            str = "NORTH";
        } else if (a >= 10 && a <= 19) {
            str = "SOUTH";
        } else if (a >= 20 && a <= 29) {
            str = "EAST";
        }

        return str;
    }

    public static void main(String[] args) {

        System.out.println(DirectionGenerator.generateDirection());
    }
}
