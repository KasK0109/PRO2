package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter p: ");
        int p = scanner.nextInt();
        scanner.close();

        int sum = power(n, p);
        System.out.println("The sum of n^p: " + sum);

        int sum2 = power(n, p);
        System.out.println("Sum 2: " + sum2);
    }

    public static int power(int n, int p) {

        if (p == 0) {
            return 1;
        } else if (p > 0) {
            return n * power(n,p - 1);
        } else {
            return 0;
        }
    }

    public static int power2(int n, int p) {

        if (p == 0) {
            return 1;
        }

        if (p > 0 && ((p % 2) != 0)) {
            return n * power(n, p - 1);
        } else if (p > 0) {
            return (n * n) * (power(n, p) / 2);
        } else {
            return 0;

        }
    }
}
