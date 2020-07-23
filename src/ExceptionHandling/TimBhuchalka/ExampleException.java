package ExceptionHandling.TimBhuchalka;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExampleException {
    public static void main(String[] args) {
        try {
            int results = divide();
            System.out.println(results);

        } catch (NoSuchElementException | ArithmeticException e)
        {
            System.out.println("Unable to perform Division...");
        }
    }


    private static int divide() {
        int x, y;
        x = getInt();
        y = getInt();

        try {
            return x / y;

        } catch (NoSuchElementException e) {
            throw new ArithmeticException("no Suitable input..");

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Attempt to divide by zero....");
        }
    }


    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer...");

        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter the digits between 0 to 9...");
            }
        }
    }
}