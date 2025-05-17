package homework.day9;

import homework.day9.class_objects.Bubble;

import java.util.Arrays;
import java.util.List;

public class Bubbles {

    public static void main(String[] args) {

//        Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
//        Проитерировать список через for-each и отпечатать объемы в консоль через пробел
//        Проитерировать список через for-each и отпечатать имена в консоль через пробел
//        Посчитать объем всех пузырей и вывести число в консоль
//        Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки

        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        for (Bubble bb : bubbles) {
            System.out.print(bb.getVolume() + " "); //итерирование списка через for-each
        }
        System.out.println();

        for (Bubble bb : bubbles) {
            System.out.print(bb.getName() + " "); //итерирование списка через for-each
        }
        System.out.println();

        int n = 0;
        for (Bubble bb : bubbles) {
            n = n + bb.getVolume();
        }
        System.out.println(n);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
