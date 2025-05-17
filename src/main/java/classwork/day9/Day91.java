package classwork.day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day91 {

    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t0 = System.currentTimeMillis(); //текущее время

        for (int i = 0; i < 100_000; i++) {
            myList1.add("smth1" + i); //заполнение списка
        }
        //long t1 = System.currentTimeMillis() - t0;
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis(); //переопределение переменной

        for (int i = 0; i < 100_000; i++) {
            myList2.add("smth2" + i); //заполнение списка
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            myList1.get(i); //итерирование списка
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            myList2.get(i); //итерирование списка
        }
        System.out.println(System.currentTimeMillis() - t0);

    }
}
