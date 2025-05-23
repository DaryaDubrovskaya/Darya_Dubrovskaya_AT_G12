package classwork.day9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Day92 {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        String[] words = "мама мыла раму мыла".split(" "); //деление строки на слова

//        for (int i = 0; i < words.length; i++) {
//            mySet.add(words[i]);
//        }

        for (String i : words) {
            mySet.add(i); //заполнение списка mySet значениями String из массива words
        }

        for (String word : mySet) { //итерирование списка
            System.out.println(word);
        }

        System.out.println();

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) { //итерирование списка
            System.out.println(iterator.next());
        }
    }
}
