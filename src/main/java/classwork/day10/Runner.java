package classwork.day10;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
//        mc.justMethod(() -> 22.22);
//        mc.justMethod(() -> {
//            System.out.println("hi");
//            return 56.67;
//        });
        mc.justMethod(System.out::println);
    }
}
