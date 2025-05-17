package homework.day9;

import homework.day9.class_objects.Sand;

import java.util.*;

public class Sandbox {

    public static void main(String[] args) {

//        Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
//        Заполнить 4 объектами песка с весом (2, 4, 2, 7) и именами (Речной, Речной, Карьерный, Речной) соответственно
//        Проитерировать список через for-each и отпечатать вес в консоль через пробел
//        Проитерировать список через for-each и отпечатать имена в консоль через пробел
//        Создать пустую карту, где ключом является целое число, а значением объект песка
//        Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
//        Проитерировать карту и отпечатать ключи в консоль
//        Проитерировать карту и отпечатать значения в консоль
//        Проитерировать карту и отпечатать пары ключ-значение в консоль

        List<Sand> sand = new ArrayList<>();
        sand.add(new Sand(2, "Речной"));
        sand.add(new Sand(4, "Речной"));
        sand.add(new Sand(2, "Карьерный"));
        sand.add(new Sand(7, "Речной"));

        for (Sand sd : sand) {
            System.out.print(sd.getWeight() + " "); //итерирование списка через for-each
        }
        System.out.println();

        for (Sand sd : sand) {
            System.out.print(sd.getName() + " "); //итерирование списка через for-each
        }
        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<>();

        // Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < sand.size(); i++) {
            sandMap.put(i + 1, sand.get(i));
        }

        for (Integer key : sandMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Sand value : sandMap.values()) {
            System.out.println(value + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
