package homework.day10;

import java.util.Arrays;
import java.util.stream.Stream;

public class ElementsRunner {

    public static void main(String[] args) {

        // Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb) (через Stream.of())
        Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb")
                // Для каждого элемента стрима пробежаться по отдельным словам
                .flatMap(string -> Arrays.stream(string.split(" ")))
                // если слово нечетное, то заменить в нем все буквы "e"
                // на букву "o", а если четное, то заменить слово на число количества буков в этом слове
                .map(s -> {
                    if (s.length() % 2 == 0) {
                        return String.valueOf(s.length());
                    } else {
                        return s.replace("e", "o");
                    }
                })
                // Оставить в потоке только уникальные значения
                .distinct()
                // Отпечатать в консоль с новой строки
                .forEach(System.out::println);
    }
}
