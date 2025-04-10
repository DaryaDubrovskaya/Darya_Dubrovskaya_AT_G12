package homework.day1.cycletask;

import java.util.Random;

public class Array {

    public void arrayMethod() {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) { //создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt
            array[i] = random.nextInt(7);
        }

        for (int i : array) { //пройти по массиву и вывести в консоль все элементы
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) { //вывести в консоль все элементы массива в обратном порядке
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) { //каждый элемент массива умножить на 5 и вывести результат в консоль
            System.out.print(array[i] * 5 + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) { //каждый элемент массива возвести в квадрат и вывести результат в консоль
            System.out.print(array[i] * array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        for (int i = 1; i < array.length; i++) { //найти минимальный элемент массива и вывести результат в консоль
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        for (int a : array) { //поменять местами первый и последний элементы и вывести результат в консоль
            System.out.print(a + " ");
        }
        System.out.println();

//        Arrays.sort(array);
//        for (int i = 0; i < array.length / 2; i++) { //отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль
//            int t = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = t;
//        }
//        System.out.println(Arrays.toString(array));

    }

}
