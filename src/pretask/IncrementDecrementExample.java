package pretask;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int w1 = 100;
        System.out.println("w1 = " + w1++); // меняет значение уже после вывода на печать
        System.out.println("w1 = " + w1 + "\n");

        int w11 = 100;
        w11++;
        System.out.println("w11 = " + w11 + "\n");

        int w2 = 100;
        System.out.println("w2 = " + ++w2 + "\n\n");


        int w3 = 100;
        System.out.println("w3 = " + w3--); // меняет значение уже после вывода на печать
        System.out.println("w3 = " + w3 + "\n");

        int w33 = 100;
        w33--;
        System.out.println("w33 = " + w33 + "\n");

        int w4 = 100;
        System.out.println("w4 = " + --w4);
    }
}
