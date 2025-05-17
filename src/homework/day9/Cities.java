package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

//        Создать пустой список стрингов cities (через new ArrayList)
//        Добавить в список 3 города (Минск, Москва, Берлин)
//        Проитерировать список через for-each и отпечатать слова в консоль с новой строки
//        Посчитать сумму всех буков во всех словах и вывести число в консоль
//        Проитерировать список по индексу и отпечатать слова в консоль через пробел

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String ct : cities) {
            System.out.println(ct); //итерирование списка через for-each
        }

        int n = 0;
        for (String ct : cities) {
            n = n + ct.length();
        }
        System.out.println(n);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " "); //итерирование списка по индексу
        }
    }
}
