package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        //long counter = list.stream().filter(d -> d.equals("мама")).count();
        //long counter = list.stream().filter(d -> "мама".equals(d)).count();
        long counter = list.stream().filter("мама"::equals).count();

        System.out.println(counter);

        //Вернуть первый элемент или «мама», если коллекция пуста
        System.out.println(list.stream().findFirst().orElse("мама"));

        //Вернуть первый элемент равный «мама»
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());

        // Вернуть пятый элемент коллекции по порядку
        System.out.println(list.stream().skip(4).findFirst().get());

        //Вернуть коллекцию из двух элементов, начиная с третьего
        System.out.println(list.stream().skip(2).limit(2).toList());

        // Выбрать коллекцию из уникальных строк,содержащих «м»
        //System.out.println(list.stream().distinct().filter(a -> a.contains("м")).toList());

        System.out.println(list.stream().filter(a -> a.contains("м")).distinct().toList());

        System.out.println(list.stream().filter(a -> a.contains("м") || a.contains("ч")).distinct().toList());

        // 03/05/2025

        //Найти существует ли хоть один «мама» элемент в коллекции
        System.out.println(list.stream().anyMatch("мама"::equals));
        System.out.println(list.stream().allMatch(a -> a.equals("м")));

        //Найти есть ли символ «м» у всех элементов коллекции
        System.out.println(list.stream().allMatch(a -> a.contains("м")));

        //Добавить "м" в конец каждого элемента и собрать в коллекцию
        System.out.println(list.stream().map(a -> a + "м").toList());

        //Разделить все слова из коллекции по букве «а», убрать пустые элементы (состоящие из 0 символов) и собрать в новую коллекцию
        System.out.println(list.stream().flatMap(а -> Arrays.stream(а.split("а"))).filter(a -> !a.equals("")).toList());
        //System.out.println(list.stream().flatMap(а -> Arrays.stream(а.split("а"))).filter(a -> !a.isEmpty()).toList());

        //Отсортировать коллекцию cтрок по алфавиту
        System.out.println(list.stream().sorted().toList());

        //Отсортировать коллекцию строк поалфавиту в обратном порядке и убрать дубликаты
        System.out.println(list.stream().sorted((x1, x2) -> -x1.compareTo(x2)).distinct().toList());

        //Разделить слова по символам, отпечатать результат, выбрать символ с максимальным значением среди букв
        System.out.println(list.stream().flatMap(a -> Arrays.stream(a.split(""))).peek(b -> System.out.print(b)).max((c1, c2) -> c1.compareTo(c2)).get());

    }
}
