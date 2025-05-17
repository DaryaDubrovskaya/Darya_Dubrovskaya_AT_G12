package classwork.day5;

public class ClassB {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassA b = new ClassA();

        a.setX(2);
        b.setX(3);

        a.setY(4);
        b.setY(5);

        //ClassA.y = 6;

        System.out.println(a.getX());
        System.out.println(b.getX());
        System.out.println(a.getY());
        System.out.println(b.getY());
    }
}
