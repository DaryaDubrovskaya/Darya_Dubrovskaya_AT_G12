package homework.day6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class InputOutputSecond {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String incoming = scanner.nextLine();

        String message = String.format("Hello, I just got '%s' from you!", incoming);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
            //oos.write(String.format("Hello, I just got '%s' from you!", incoming).getBytes());
            oos.write(message.getBytes());
        } catch (IOException e) {
            System.out.println("Какой-то exception!");
        }
    }
}