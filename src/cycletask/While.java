package cycletask;

public class While {

    public static void main(String[] args) {
        new While().whileMethod();
    }

    public static void whileMethod () {
        int i = 0;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
    }
}
