package homework.day9;

import homework.day9.class_objects.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Furniture {

    public static void main(String[] args) {

//        Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2) и шириной (2, 2, 4) соответственно, через (Arrays.asList())
//        Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
//        Создать пустую карту, где ключом является целое число, а значением объект стула
//        Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
//        Проитерировать карту и отпечатать ключи в консоль
//        Проитерировать карту и отпечатать значения в консоль
//        Проитерировать карту и отпечатать пары ключ-значение в консоль

        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4));

        for (Chair ch : furniture) {
            System.out.print(ch.getHeight() * ch.getWidth() + " "); //итерирование списка через for-each
        }
        System.out.println();

        Map<Integer, Chair> chairMap = new HashMap<>();

        // Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < furniture.size(); i++) {
            chairMap.put(i + 1, furniture.get(i));
        }

        for (Integer key : chairMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        for (Chair value : chairMap.values()) {
            System.out.println(value + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
