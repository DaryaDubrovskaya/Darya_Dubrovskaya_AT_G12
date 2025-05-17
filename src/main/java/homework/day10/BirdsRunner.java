package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {

    public static void main(String[] args) {

        // Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        // Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
        Arrays.stream((birds.stream()
                        // Заменить каждую букву "о" на букву "а"
                        .map(str -> str.replace("о", "а"))
                        // Собрать все слова в одну строку в нижнем регистре
                        .collect(Collectors.joining(" "))
                        .toLowerCase()
                        // Убрать все символы мягкого знака
                        .replace("ь", ""))
                        // Разбить на новые строки по букве "б"
                        .split("б"))
                // Отпечатать в консоль с новой строки в виде --Чайка--
                .forEach(str -> System.out.println("--" + str + "--"));
    }
}
