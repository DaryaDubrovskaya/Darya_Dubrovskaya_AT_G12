package basetask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {
        TrainMethodsIf print = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + print.returnNewInt(15));
        System.out.println("метод returnNewLong вернул " + print.returnNewLong(45));
        System.out.println("метод returnNewChar вернул " + print.returnNewChar('$'));
        System.out.println("метод returnNewChar вернул " + print.returnNewChar('g'));
        System.out.println("метод returnNewFloat вернул " + print.returnNewFloat(0.67F));
        System.out.println("метод returnNewFloat вернул " + print.returnNewFloat(0.77F));
        System.out.println("метод returnNewDouble вернул " + print.returnNewDouble(0.778855));

        print.returnNewBoolean(false);
    }
}
