package homework.day9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) {

//        Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
//        Проитерировать список через for-each и отпечатать слова в файл figures через тире
//        Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
//        Проитерировать список по индексу и отпечатать слова в консоль через пробел
//        Вставить на 3 позицию Треугольник
//        Проитерировать список через for-each и отпечатать слова в консоль через пробел

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        try (BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"))) {
            for (String fg : figures) {
                out.write(fg + " - "); //итерирование списка через for-each
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        int n = 0;
        for (String fg : figures) {
            if (!fg.contains("и")) {
                n++;
            }
        }
        System.out.println(n);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " "); //итерирование списка по индексу
        }
        System.out.println();

        figures.set(2, "Треугольник");

        for (String fg : figures) {
            System.out.print(fg + " "); //итерирование списка через for-each
        }
    }
}
