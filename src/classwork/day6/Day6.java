package classwork.day6;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.contains("got")) {
                return;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }
    }
}
