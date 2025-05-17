package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {

//        Создать пустой список стрингов butterflies (через new ArrayList)
//        Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
//        Проитерировать список через for-each и отпечатать слова в консоль в кавычках
//        Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
//        Проитерировать список по индексу и отпечатать слова в консоль через пробел
//        Проитерировать список через for-each и отпечатать слова в консоль через перенос строки

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String bt : butterflies) {
            System.out.println("\"" + bt + "\", "); //итерирование списка через for-each
        }

        int n = 0;
        for (String bt : butterflies) {
            if (bt.contains("o")) {
                n++;
            }
        }
        System.out.println(n);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " "); //итерирование списка по индексу
        }
        System.out.println();

        for (String bt : butterflies) {
            System.out.println(bt); //итерирование списка через for-each
        }
    }
}
