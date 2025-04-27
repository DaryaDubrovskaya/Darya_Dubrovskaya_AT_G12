package classwork.day6;

import java.util.ArrayList;
import java.util.List;

public class Day9 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        //String str = "мама мыла раму";

        String[] words = "мама мыла раму".split(" ");


        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        for (String arr : myList) {
            System.out.println(arr);
        }

    }
}
