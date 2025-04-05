package basetask;

public class TrainMethodsStringRunner {
    public static void main(String[] args) {
        TrainMethodsString print = new TrainMethodsString();
        print.printMama();
        print.printPapa();
        TrainMethodsString.printString("метод принимает на вход строку и печатает в консоль эту строку");  //разобрать этот метод на занятии, долго разбиралась с ООП
        TrainMethodsString.printMamaString("принимает на вход строку и печатает в консоль после «мама мыла»");
    }
}
