package homework.day10;

import java.util.List;
import java.util.stream.Stream;

public class CountriesRunner {

    public static void main(String[] args) {

        // Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
        List<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия").toList();

        countries.stream()
                // Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
                .filter(str -> str.toLowerCase().matches(".*[аеёиоуыэюяАЕЁИОУЫЭЮЯ].*"))
                // Отфильтровать страны, в названии которых меньше 7 букв
                .filter(str -> str.length() < 7)
                // Перевести все страны в верхний регистр
                //.map(str -> str.toUpperCase())
                .map(String::toUpperCase)
                // Добавить к каждому названию кавычки
                .map(str -> "\"" + str + "\"")
                // Отпечатать в консоль с новой строки
                .forEach(System.out::println);
    }
}
