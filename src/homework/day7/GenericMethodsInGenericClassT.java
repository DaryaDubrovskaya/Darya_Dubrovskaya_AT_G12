package homework.day7;

public class GenericMethodsInGenericClassT<T> {

    void genericMethodOneGenArg(T a) {
        System.out.printf("I am an object of %s class" + "\n", a.getClass().getSimpleName());
    }

    String genericMethodTwoGenArgs(T a, T b) {
        String message = String.format("We are objects of %s class and %s class" + "\n", a.getClass().getSimpleName(), b.getClass().getSimpleName());
        return message;
    }

    void genericMethodHalfGenArgs(T a, String c) {
        System.out.printf("I got an object of %s class and string with %s characters" + "\n", a.getClass().getSimpleName(), c.length());
    }
}
