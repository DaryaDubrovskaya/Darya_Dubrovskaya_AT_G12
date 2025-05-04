package homework.day7;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

String genericMethodGenArgs(X a, Y b) {
    String message = String.format("I received 2 arguments of type: %s class, %s class" + "\n", a.getClass().getSimpleName(), b.getClass().getSimpleName());
    return message;
}

String genericMethodGenArgs(X a) {
    String message = String.format("I received 1 arguments of type: %s class" + "\n", a.getClass().getSimpleName());
    return message;
}

void genericMethodHalfGenArgs(X a, Y b, String c) {
    System.out.printf("I got an object of X class and Y class and string with N characters" + "\n", a.getClass().getSimpleName(), c.length());
}

void genericMethodHalfGenArgs(X a, String c) {
        System.out.printf("I got an object of X class and Y class and string with N characters" + "\n", a.getClass().getSimpleName(), c.length());
}

//void genericMethodHalfGenArgs(Y b, String c) {
//        System.out.printf("I got an object of X class and Y class and string with N characters" + "\n", b.getClass().getSimpleName(), c.length());
//}
}
