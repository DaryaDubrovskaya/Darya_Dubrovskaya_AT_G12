package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

//        Создать пустой список стрингов countries (через new ArrayList)
//        Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
//        Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
//        Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
//        Проитерировать список по индексу и отпечатать слова в консоль с новой строки

        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String ctr : countries) {
            System.out.print(ctr + ", "); //итерирование списка через for-each
        }
        System.out.println();

        int n = 0;
        for (String ctr : countries) {
            if (ctr.length() < 7) {
                n++;
            }
        }
        System.out.println(n);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i)); //итерирование списка по индексу
        }
    }
}
