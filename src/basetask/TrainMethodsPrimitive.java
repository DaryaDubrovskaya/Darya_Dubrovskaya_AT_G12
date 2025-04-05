package basetask;

public class TrainMethodsPrimitive {

    public static void main(String[] args) {
        printInt(25);
        printLong(1234567805678943L);
        printChar('&');
        printFloat(0.97546F);
        printDouble(0.987686746535435767);
        printShort((short) -56); // вот это проговорить надо, пока так не сделала, не распознавало
        printByte((byte) 1); // вот это проговорить надо, пока так не сделала, не распознавало
        printBoolean(true); // почему тут не распознаёт тип
    }

    public static void printInt(int numb) {
        System.out.println("я получил на вход число " + numb);
    }

    public static void printLong(Long lnumb) {
        System.out.println("я получил на вход  длинное число " + lnumb);
    }

    public static void printChar(char symb) {
        System.out.println("я получил на вход символ " + symb);
    }

    public static void printFloat(Float fnumb) {
        System.out.println("я получил на вход дробное число " + fnumb);
    }

    public static void printDouble(double dnumb) {
        System.out.println("я получил на вход длинное дробное число " + dnumb);
    }

    public static void printShort(Short snumb) {
        System.out.println("я получил на вход короткое число " + snumb);
    }

    public static void printByte(byte byt) {
        System.out.println("я получил на вход очень короткое число " + byt);
    }

    public static void printBoolean(boolean bool) {
        System.out.println("я получил на вход булево " + bool);
    }

}
