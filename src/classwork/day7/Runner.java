package classwork.day7;

import classwork.day5.ClassA;

import java.nio.channels.ClosedSelectorException;

public class Runner {

    public static void main(String[] args) {

        GenD<String> x = new GenD<>("bugagaq");
        System.out.println(x.buga);

        GenD<ClassA> y = new GenD<>(new ClassA());
    }
}
