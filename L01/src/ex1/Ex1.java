package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = scanner.nextInt();

        int factorial = multiply(n);
        System.out.println("Factorial to " + n + " = " + factorial);
        scanner.close();

    }

    public static int multiply(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * multiply(n - 1);
        }
    }
}
