package classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class Day9 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        //String str = "мама мыла раму";
        //String[] words = str.split(" ");

        String[] words = "мама мыла раму".split(" "); //деление строки на слова

        for (int i = 0; i < words.length; i++) {
            myList.add(words[i]); //заполнение списка myList словами из массива words
            System.out.println(myList.get(i));
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i)); //итерирование списка
        }

        for (String arr : myList) {
            System.out.println(arr); //итерирование списка
        }

    }
}
