package homework.day9;

import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

//        Создать пустой список стрингов noodles (через new ArrayList)
//        Добавить в список 4 вида макарон (стринги Hakka, Ramen, Hibachi, Schezwan)
//        Проитерировать список через for-each и отпечатать слова в консоль через тире
//        Заменить в каждом слове буквы "а" на букву "о"
//        Проитерировать список по индексу и отпечатать слова в консоль через пробел

        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String nd : noodles) {
            System.out.print(nd + "-"); //итерирование списка через for-each
        }
        System.out.println();

        // Замена всех букв "а" на "о" в каждом элементе списка
        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace("a", "o"));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " "); //итерирование списка по индексу
        }
    }
}
