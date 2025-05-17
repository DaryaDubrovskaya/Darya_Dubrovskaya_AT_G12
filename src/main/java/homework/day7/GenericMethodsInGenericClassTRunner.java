package homework.day7;

import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.craft.field.Car;
import homework.day4.playground.essence.craft.field.Moped;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> s = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> i = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> d = new GenericMethodsInGenericClassT<>();

        s.genericMethodOneGenArg("строка1");
        System.out.println(s.genericMethodTwoGenArgs("строка1", "строка2"));
        s.genericMethodHalfGenArgs("строка1", "строка3");

        i.genericMethodOneGenArg(123);
        System.out.println(i.genericMethodTwoGenArgs(12, 13));
        i.genericMethodHalfGenArgs(2, "строка");

        d.genericMethodOneGenArg(123.1212);
        System.out.println(d.genericMethodTwoGenArgs(12.4323, 13.3423));
        d.genericMethodHalfGenArgs(2.4546, "строка");

        GenericMethodsInGenericClassT<Copter> copter = new GenericMethodsInGenericClassT<>();
        Copter ar1 = new Copter(2, "имя1");
        Copter ar2 = new Copter(3, "имя2");
        copter.genericMethodOneGenArg(ar1);
        //copter.genericMethodOneGenArg(new Copter(2, "имя1"));
        System.out.println(copter.genericMethodTwoGenArgs(ar1, ar2));
        //System.out.println(copter.genericMethodTwoGenArgs(new Copter(2, "имя1"), new Copter(3, "имя2")));
        copter.genericMethodHalfGenArgs(ar1, "какая-то строка");
        //copter.genericMethodHalfGenArgs(new Copter(2, "имя1"), "какая-то строка");

        GenericMethodsInGenericClassT<Plane> plane = new GenericMethodsInGenericClassT<>();
        Plane pl1 = new Plane(2, "имя1");
        Plane pl2 = new Plane(1, "имя2");
        plane.genericMethodOneGenArg(pl1);
        System.out.println(plane.genericMethodTwoGenArgs(pl1, pl2));
        plane.genericMethodHalfGenArgs(pl1, "какая-то строка");

        GenericMethodsInGenericClassT<Rocket> rocket = new GenericMethodsInGenericClassT<>();
        Rocket rk1 = new Rocket(2, "имя1");
        Rocket rk2 = new Rocket(4, "имя2");
        rocket.genericMethodOneGenArg(rk1);
        System.out.println(rocket.genericMethodTwoGenArgs(rk1, rk2));
        rocket.genericMethodHalfGenArgs(rk1, "какая-то строка");

        GenericMethodsInGenericClassT<Car> car = new GenericMethodsInGenericClassT<>();
        Car cr1 = new Car(2, "имя1");
        Car cr2 = new Car(3, "имя2");
        car.genericMethodOneGenArg(cr1);
        System.out.println(car.genericMethodTwoGenArgs(cr1, cr2));
        car.genericMethodHalfGenArgs(cr1, "какая-то строка");

        GenericMethodsInGenericClassT<Moped> moped = new GenericMethodsInGenericClassT<>();
        Moped mp1 = new Moped(2, "имя1");
        Moped mp2 = new Moped(3, "имя2");
        moped.genericMethodOneGenArg(mp1);
        System.out.println(moped.genericMethodTwoGenArgs(mp1, mp2));
        moped.genericMethodHalfGenArgs(mp1, "какая-то строка");

    }
}
