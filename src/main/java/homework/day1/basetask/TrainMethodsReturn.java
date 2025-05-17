package homework.day1.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int x) {
        return (3 * x);
    }

    public long returnNewLong(long y) {
        return (y - 4);
    }

    public String returnNewChar(char ch) {
        return new String(ch + " " + ch);
    }

    public float returnNewFloat(float f) {
        return (f / 2);
    }

    public double returnNewDouble(double d) {
        return (d + 8);
    }

    public short returnNewShort(short sh) {
        return (short) (sh - 1);
    }

    public byte returnNewByte(byte b) {
        return (byte) (b * 2);
    }

    public boolean returnNewBoolean(boolean bo) {
        return (!bo);
    }

}
