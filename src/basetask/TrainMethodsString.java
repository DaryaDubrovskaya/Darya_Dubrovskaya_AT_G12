package basetask;

public class TrainMethodsString {

   public static void main(String[] args) {

       TrainMethodsString printm = new TrainMethodsString(); //ecли все методы в одном классе, то эта строка по любому нужна ?
       printm.printMama();

//       TrainMethodsString printp = new TrainMethodsString(); //ecли все методы в одном классе, то эта строка по любому нужна ?
//       printp.printPapa();

       new TrainMethodsString().printPapa();

       printString("метод принимает на вход строку и печатает в консоль эту строку");  //разобрать этот метод на занятии, долго разбиралась с ООП

       printMamaString("принимает на вход строку и печатает в консоль после «мама мыла»");

    }

    public void printMama() {
        System.out.println("мама мыла раму");
    }

    public void printPapa() {
        System.out.println("пама мыла раму");
    }

    public static void printString(String str) {
        System.out.println(str);
    }

    public static void printMamaString(String str) {
        System.out.println("мама мыла + " + str);
    }

}
