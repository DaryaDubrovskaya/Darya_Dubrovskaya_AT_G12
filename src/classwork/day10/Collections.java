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

        System.out.println(list.stream().findFirst().orElse("мама"));

        System.out.println(list.stream().filter("мама"::equals).findFirst().get());

        System.out.println(list.stream().skip(4).findFirst().get());

        System.out.println(list.stream().skip(2).limit(2).toList());

        //System.out.println(list.stream().distinct().filter(a -> a.contains("м")).toList());

        System.out.println(list.stream().filter(a -> a.contains("м")).distinct().toList());

        System.out.println(list.stream().filter(a -> a.contains("м") || a.contains("ч")).distinct().toList());

    }
}
