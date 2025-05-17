package homework.day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {

//        Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
//        Проитерировать список через for-each и отпечатать числа в консоль новой строки
//        Посчитать сумму всех чисел и вывести результат в консоль
//        Отсортировать список по возрастанию
//        Проитерировать список по индексу и отпечатать числа в консоль через пробел
//        Развернуть список в обратном порядке
//        Проитерировать список через for-each и отпечатать числа в консоль через пробел

        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (Integer nm : numbers) {
            System.out.println(nm); //итерирование списка через for-each
        }

        int n = 0;
        for (Integer nm : numbers) {
            n = n + nm;
        }
        System.out.println(n);

        Collections.sort(numbers); // Сортировка списка по возрастанию

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " "); //итерирование списка по индексу
        }
        System.out.println();

        Collections.reverse(numbers); // Разворачивание списка

        for (Integer nm : numbers) {
            System.out.print(nm + " "); //итерирование списка через for-each
        }
    }
}
