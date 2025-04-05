package basetask;

public class TrainMethodsReturn {

    public static void main(String[] args) {
        //returnNewInt(4);
        System.out.println(returnNewInt(4));

        //returnNewLong(45676789877L);
        System.out.println(returnNewLong(45676789877L));

        //returnNewChar('%');
        System.out.println(returnNewChar('%'));

        //returnNewFloat(46.44888F);
        System.out.println(returnNewFloat(46.44888F));

        //returnNewDouble(0.987686746535435767);
        System.out.println(returnNewDouble(0.987686746535435767));

        //returnNewShort((short) -43);
        System.out.println(returnNewShort((short) -43));

        //returnNewByte((byte) 8);
        System.out.println(returnNewByte((byte) 8));

        //returnNewBoolean(true);
        System.out.println(returnNewBoolean(true));
    }

    public static int returnNewInt(int x) {
    return (3 * x);
}

    public static long returnNewLong(long y) {
        return (y - 4);
    }

    public static String returnNewChar(char ch) {
        return new String(ch + " " + ch);
    }

    public static float returnNewFloat(float f) {
    return (f / 2);
}

    public static double returnNewDouble(double d) {
        return (d + 8);
    }
    public static short returnNewShort(short sh) {
        return (short) (sh - 1);
    }
    public static byte returnNewByte(byte b) {
        return (byte) (b * 2);
    }
    public static boolean returnNewBoolean(boolean bo) {
        return (!bo);
    }
}
