package homework.day1.basetask;

public class TrainMethodsIf {

    public double returnNewInt(int x) {
        if (x < 8) {
            return (x * 7);
        } else {
            return ((x * 1.00) / 4);
        }
    }

    public long returnNewLong(long y) {
        if (y > 300) {
            return (y - 300);
        } else {
            return (y + 20);
        }
    }

    public String returnNewChar(char ch) {
        if (ch == 'g') {
            return ("go");
        } else {
            return ("o" + ch);
        }
    }

    public float returnNewFloat(float f) {
        if (f == 0.67F) {
            return (f);
        } else {
            return (f * 2);
        }
    }

    public double returnNewDouble(double d) {
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

    public void returnNewBoolean(boolean boo) {
        if (boo == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}


