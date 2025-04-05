package basetask;

public class Mouse {
    private static String name;
    private static int age;
    public Object printMouseDetails;

    public static void main(String[] args) {
        Mouse mouse = new Mouse("Мышь Летучая", 25);
        mouse.printMouseDetails ();
    }

    public static void printMouseDetails() {
    System.out.println("Я мышь, меня зовут " + name + " и мне " + age + " лет");
}

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Mouse.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Mouse.age = age;
    }
}
