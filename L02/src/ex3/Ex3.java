package ex3;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(calcNo(4));

    }

    public static int calcNo(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        } else if (n % 2 == 0) {
            return 2 * calcNo(n - 3) + calcNo(n - 1);
        } else {
            return calcNo(n - 1) + calcNo(n - 2) + (3 * calcNo(n - 3));
        }
    }
}

