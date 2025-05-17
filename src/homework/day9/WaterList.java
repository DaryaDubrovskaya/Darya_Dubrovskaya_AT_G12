package homework.day9;

import homework.day9.class_objects.Water;

import java.util.Arrays;
import java.util.List;

public class WaterList {

    public static void main(String[] args) {

//        Создать список воды (класса Water) water из 3 объектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
//        Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки

        List<Water> water = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));

        for (Water wt : water) {
            System.out.print(wt.getColor() + " - " + wt.getSmell() + "\n"); //итерирование списка через for-each
        }
    }

}
