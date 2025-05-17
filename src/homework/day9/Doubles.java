package homework.day9;

import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

//        Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())
//        Проитерировать список через for-each и отпечатать числа в консоль через пробел
//        Посчитать произведение всех чисел и вывести результат в консоль
//        найти сумму всех дробных частей и вывести результат в консоль
//        Проитерировать список по индексу и вывести целые части в консоль через пробел

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double db : doubles) {
            System.out.print(db + " "); //итерирование списка через for-each
        }
        System.out.println();

        double n = 1;
        for (Double db : doubles) {
            n = n * db;
        }
        System.out.println(n);

        double d = 0;
        for (double db : doubles) {
            d += db - Math.floor(db); // Вычисляем дробную часть числа
        }
        System.out.println(d);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print((int) Math.floor(doubles.get(i)) + " "); // Извлекаем целую часть
        }
    }
}
