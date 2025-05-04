package homework.day7;

import homework.day4.playground.essence.creatures.Crocodile;
import homework.day4.playground.essence.creatures.Potato;
import homework.day4.playground.essence.creatures.Raven;
import homework.day4.playground.essence.creatures.Rose;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams <String, String> ss = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams <String, Integer> si = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams <String, Double> sd = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams <Integer, Integer> ii = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(ss.genericMethodGenArgs("строка1", "строка2"));
        System.out.println(ss.genericMethodGenArgs("строка1"));
        ss.genericMethodHalfGenArgs("строка1", "строка3", "какая-то строка");
        ss.genericMethodHalfGenArgs("строка1", "какая-то строка");

        System.out.println(si.genericMethodGenArgs("строка1", 123));
        System.out.println(si.genericMethodGenArgs("строка1"));
        si.genericMethodHalfGenArgs("строка1", 456, "какая-то строка");
        si.genericMethodHalfGenArgs("строка1", "какая-то строка");

        System.out.println(sd.genericMethodGenArgs("строка1", 123.22));
        System.out.println(sd.genericMethodGenArgs("строка1"));
        sd.genericMethodHalfGenArgs("строка1", 456.33, "какая-то строка");
        sd.genericMethodHalfGenArgs("строка1", "какая-то строка");

        System.out.println(ii.genericMethodGenArgs(567, 123));
        System.out.println(ii.genericMethodGenArgs(456));
        ii.genericMethodHalfGenArgs(678, 456, "какая-то строка");
        ii.genericMethodHalfGenArgs(789, "какая-то строка");

        GenericMethodsInGenericClassTwoParams <Rose, Raven> rr = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(rr.genericMethodGenArgs(new Rose(3,"имя1"), new Raven(3,"имя2")));
        System.out.println(rr.genericMethodGenArgs(new Rose(6,"имя2")));
        rr.genericMethodHalfGenArgs(new Rose(3,"имя1"), new Raven(3,"имя2"), "какая-то строка");
        rr.genericMethodHalfGenArgs(new Rose(3,"имя1"), "какая-то строка");

        GenericMethodsInGenericClassTwoParams <Crocodile, Potato> cp = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(cp.genericMethodGenArgs(new Crocodile(3,"имя1"), new Potato(3,"имя2")));
        System.out.println(cp.genericMethodGenArgs(new Crocodile(6,"имя2")));
        cp.genericMethodHalfGenArgs(new Crocodile(3,"имя1"), new Potato(3,"имя2"), "какая-то строка");
        cp.genericMethodHalfGenArgs(new Crocodile(3,"имя1"), "какая-то строка");

    }
}
