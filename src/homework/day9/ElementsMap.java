package homework.day9;

import java.util.HashMap;
import java.util.Map;

public class ElementsMap {

    public static void main(String[] args) {

//        Создать пустую коллекцию ключ-значение elements, содержающую Integer в качестве ключей, стринги в качестве значения (через new HashMap)
//        Добавить в список 7 элементов (Silicon, Sulfur, Argon, Calcium, Chromium, Iron, Zinc) с ключами, равными порядку их добавления в коллекцию, начиная с 1-цы
//        Проитерировать коллекцию через for-each и отпечатать название элементов в консоль через пробел
//        Посчитать сколько названий элементов содержит букву "u" и вывести число в консоль
//        Проитерировать коллекцию и отпечатать пары ключ-значение в консоль с новой строки
//        Заменить значение 4-го элемента на Selenium
//        Удалить 2-й элемент коллекции
//        Проитерировать коллекцию и отпечатать пары ключ-значение в консоль с новой строки

        Map<Integer, String> elements = new HashMap<>();
        elements.put(1, "Silicon");
        elements.put(2, "Sulfur");
        elements.put(3, "Argon");
        elements.put(4, "Calcium");
        elements.put(5, "Chromium");
        elements.put(6, "Iron");
        elements.put(7, "Zinc");

        for (String el : elements.values()) {
            System.out.print(el + " ");
        }
        System.out.println();

        int n = 0;
        for (String el : elements.values()) {
            if (el.toLowerCase().contains("u")) {
                n++;
            }
        }
        System.out.println(n);

        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();

        elements.put(4, "Selenium");

        elements.remove(2);

        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
