package homework.day9;

import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

//        Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//        Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
//        Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
//        Проитерировать список по индексу и отпечатать слова в консоль через пробел
//        Заменить 3-й элемент списка на Синица
//        Проитерировать список через for-each и отпечатать слова в консоль через пробел

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bd : birds) {
            System.out.println("--" + bd + "--"); //итерирование списка через for-each
        }

        int n = 0;
        for (String bd : birds) {
            int vowelCount = countVowels(bd); // с этим нужно разобраться, написала нейросеть
            if (vowelCount > 1) {
                n++;
            }
        }
        System.out.println(n);



        birds.set(2, "Синица");
        System.out.println();

        for (String bd : birds) {
            System.out.print(bd + " "); //итерирование списка через for-each
        }
    }

    public static int countVowels(String word) { // с этим нужно разобраться, написала нейросеть
        String vowels = "аеёиоуыэюя"; // Русские гласные буквы
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
