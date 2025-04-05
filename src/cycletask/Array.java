package cycletask;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        new Array().arrayMethod();
    }

    public static void arrayMethod() {
        int[] array = new int [7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]*5 + " ");
        }
        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array[i] + " ");
        }
        System.out.println("");

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("");

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
        System.out.println(Arrays.toString(array));
    }
}
