package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class Elements {

    public static void main(String[] args) {

//        Создать пустой список стрингов elements (через new ArrayList)
//        Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
//        Проитерировать список через for-each и отпечатать слова в консоль через пробел
//        Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
//        Проитерировать список по индексу и отпечатать слова в консоль через пробел
//        На 4-ю позицию добавить Spinner
//        Удалить 2-й элемент списка
//        Заменить 5-й элемент на Switch
//        Проитерировать список через for-each и отпечатать слова в консоль через пробел

        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String el : elements) {
            System.out.print(el + " "); //итерирование списка через for-each
        }

        int n = 0;
        for (String el : elements) {
            if (el.split(" ").length > 1) { // проверяем количество слов
                n++;
            }
        }
        System.out.println(n);

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " "); //итерирование списка по индексу
        }

        elements.add(3, "Spinner");
        System.out.println(elements);

        elements.remove(1);
        System.out.println(elements);

        elements.set(4, "Switch");
        System.out.println(elements);

        for (String el : elements) {
            System.out.print(el + " "); //итерирование списка через for-each
        }
    }
}
