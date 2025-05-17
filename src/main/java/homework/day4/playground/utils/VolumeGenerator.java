package homework.day4.playground.utils;

import homework.day4.playground.essence.material.Pourable;

import java.util.Random;

public class VolumeGenerator {

    public static int generateVolume(Pourable pourable) {

        Random random = new Random();
        int a = 0;

        if (pourable.getClass().getSimpleName().equals("Diesel") || pourable.getClass().getSimpleName().equals("Petrol")) {
            a = random.nextInt(1, 50);
        }
        if (pourable.getClass().getSimpleName().equals("Water")) {
            a = random.nextInt(50, 100);
        }

        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %d", pourable.getClass().getSimpleName(), a);
        return a;
    }
}
