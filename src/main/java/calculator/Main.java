package calculator;

import java.util.Scanner;

/**
 * Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation div = (x, y) -> (double)x / y;
        Operation multiple = (x, y) -> x * y;

        System.out.println(a + " + " + b + " = " + add.calculate(a, b));
        System.out.println(a + " - " + b + " = " + sub.calculate(a, b));
        System.out.println(a + " * " + b + " = " + multiple.calculate(a, b));
        System.out.println(a + " / " + b + " = " + div.calculate(a, b));

    }
}
