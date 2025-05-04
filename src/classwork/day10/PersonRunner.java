package classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));


        //найти работоспособных женщин в возрасте от 18 до 55, мужчин от 18 до 60
        int count = 0;
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);
            if ((person.sex.equals(Person.Sex.MAN) && person.age >= 18 && person.age <= 60)
                    || (person.sex.equals(Person.Sex.WOMEN) && person.age >= 18 && person.age <= 55)) {
                count++;
            }
        }
        System.out.println(count);


        //то же самое с использованием Stream API
        System.out.println(people.stream().filter(person -> (person.sex.equals(Person.Sex.MAN) && person.age >= 18 && person.age <= 60)
                || (person.sex.equals(Person.Sex.WOMEN) && person.age >= 18 && person.age <= 55)).count());

        //Отсортировать коллекцию людей сначала по полу, а потом по возрасту, вывести результат в консоль и вернуть результирующую коллекцию
        System.out.println(people.stream().sorted((p1, p2) -> {
            if (p1.sex.equals(p2.sex)) {
                return p1.age - p2.age;
            } else {
                return p1.sex.compareTo(p2.sex);
            }
        }).toList());


        System.out.println(people.stream().min(Comparator.comparingInt(p -> p.age)).get());
        System.out.println(people.stream().sorted((p1, p2) -> p1.age - p2.age).findFirst().get());
    }
}
