package cycletask;

public class For {

    public static void main(String[] args) {
        new For().forMethod();
    }

    public static void forMethod () {
        for (int i = 3; i <= 19; i = i + 2 ) {
            System.out.print(i + " ");
        }
    }
}
