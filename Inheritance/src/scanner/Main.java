package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String... args){

        Integer value = null;

        do {
            try {
                System.out.print("Input an integer: ");
                Scanner scanner = new Scanner(System.in);
                value = scanner.nextInt();

                System.out.println("Value: " + value);
            } catch (InputMismatchException e) {
                System.out.println("Value is not an integer!");
            }

        }while (value == null);
    }
}
