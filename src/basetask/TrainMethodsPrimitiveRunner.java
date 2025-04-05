package basetask;

import static basetask.TrainMethodsPrimitive.*; // почему просит импортировать методы static ??

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive print = new TrainMethodsPrimitive();
        printInt(25);
        printLong(1234567805678943L);
        printChar('&');
        printFloat(0.97546F);
        printDouble(0.987686746535435767);
        printShort((short) -56); // вот это проговорить надо, пока так не сделала, не распознавало
        printByte((byte) 1); // вот это проговорить надо, пока так не сделала, не распознавало
        printBoolean(true); // почему тут не распознаёт тип
    }

}
