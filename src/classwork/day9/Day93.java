package classwork.day9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Day93 {

    public static void main(String[] args) {

        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> myMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            myMap.put(i, array[i]); //заполнение HashMap
        }

        Set<Integer> keys = myMap.keySet();
       // for (int key : myMap.keySet()) {
        for (int key : keys) {
            System.out.println(key);
        }

        Collection<String> values = myMap.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<Integer, String>> couples = myMap.entrySet();
        for (Map.Entry<Integer, String> couple : couples) {
            System.out.println(couple.getKey() + " " + couple.getValue());
        }
    }
}
