package homework.day1.basetask;

public class TrainMethodsStringRunner {

    public static void main(String[] args) {

        TrainMethodsString print = new TrainMethodsString();
        print.printMama();

        new TrainMethodsString().printPapa();

        new TrainMethodsString().printString("метод принимает на вход строку и печатает в консоль эту строку");

        new TrainMethodsString().printMamaString("метод принимает на вход строку и печатает в консоль после «мама мыла»");
    }

}
