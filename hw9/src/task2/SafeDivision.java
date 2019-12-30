package task2;

import java.util.Scanner;

public class SafeDivision {

    private Scanner scanner = new Scanner(System.in);
    double firstNumber;
    double lastNumber;

    public void setNumbers() {
        System.out.println("Enter your fist number: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Enter your last number: ");
        lastNumber = scanner.nextDouble();
    }

    public void division() {
        setNumbers();
        try {
            double result = firstNumber / lastNumber;
            System.out.println("Result by divide: " + result);
            if (lastNumber == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException exception) {
            System.out.println("You can't divide by null, enter another last number !!!!");
            System.out.println("Enter your last number again: ");
            lastNumber = scanner.nextDouble();
            System.out.println("Result by divide: " + (firstNumber / lastNumber));
            division();
        } finally {
            scanner.close();
        }
    }
}
