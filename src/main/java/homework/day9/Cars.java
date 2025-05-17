package homework.day9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cars {

    public static void main(String[] args) {

//        Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)
//        Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
//        Найти и удалить из набора авто, в названии которых больше 4 букв
//        Проитерировать список через for-each и отпечатать слова в консоль через пробел

        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try (BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"))) {
            for (String cr : cars) {
                out.write("\"" + cr + "\" " + '\n'); //итерирование списка через for-each
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() > 4) {
                iterator.remove();
            }
        }
        System.out.println(cars);

        for (String cr : cars) {
            System.out.println(cr + " "); //итерирование списка через for-each
        }
    }
}
