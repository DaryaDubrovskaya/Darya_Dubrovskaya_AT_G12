package homework.day6;

import java.util.Scanner;

public class InputOutputFirst {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        String incoming = scanner.nextLine();

        System.out.printf("Hello, I just got '%s' from you!", incoming);
    }
}
