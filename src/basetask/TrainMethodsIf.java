package basetask;

import static basetask.TrainMethodsReturn.returnNewInt;

public class TrainMethodsIf {

    public static void main(String[] args) {

        System.out.println(returnNewInt(15));
        System.out.println(returnNewLong(45));
        System.out.println(returnNewChar('$'));
        System.out.println(returnNewChar('g'));
        System.out.println(returnNewFloat(0.67F));
        System.out.println(returnNewFloat(0.77F));
        System.out.println(returnNewDouble(0.778855));

        returnNewBoolean(false);
    }

    public static double returnNewInt(int x) {
        if (x < 8) {
            return (x * 7);
        } else {
            return ((x * 1.00)/ 4); // как ещё можно x сделать double чтобы вывести дробное число после деления ?
        }
    }
    public static long returnNewLong(long y) {
        if (y > 300) {
            return (y - 300);
        } else {
            return (y + 20);
        }
    }
    public static String returnNewChar(char ch) {
        if (ch == 'g') {
            return ("go");
        } else {
            return ("o" + ch);
        }
    }
    public static float returnNewFloat(float f) {
        if (f == 0.67F) {
            return (f);
        } else {
            return (f * 2);
        }
    }
    public static double returnNewDouble(double d) {
        if (d > 30 && d < 80) {
            return (d + 87);
        } else if (d > 80 && d < 400) {
            return (d - 87);
        } else if (d > 400) {
            return (d / 4);
        } else {
            return (d);
        }
    }
    public static void returnNewBoolean (boolean boo) {
        if (boo == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}


