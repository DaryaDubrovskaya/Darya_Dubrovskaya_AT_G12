package homework.day1.basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn print = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + print.returnNewInt(4));

        System.out.println("метод returnNewLong вернул " + print.returnNewLong(45676789877L));

        System.out.println("метод returnNewChar вернул " + print.returnNewChar('%'));

        System.out.println("метод returnNewFloat вернул " + print.returnNewFloat(46.44888F));

        System.out.println("метод returnNewDouble вернул " + print.returnNewDouble(0.987686746535435767));

        System.out.println("метод returnNewShort вернул " + print.returnNewShort((short) -43));

        System.out.println("метод returnNewByte вернул " + print.returnNewByte((byte) 8));

        System.out.println("метод returnNewBoolean вернул " + print.returnNewBoolean(true));
    }

}
