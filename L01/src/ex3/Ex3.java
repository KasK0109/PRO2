package ex3;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println(prod(5,1));
        System.out.println(prod2(9,1));

    }

    public static int prod(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        } else if (a == 1) {
            return b;
        } else if (b == 1) {
            return a;
        } else {
            return a + prod(a, b - 1);
        }
    }

    public static int prod2(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        } else if (b == 1) {
            return a;
        } else if (a % 2 == 0 && a >= 2) {
            return prod2(a / 2, b + b);
        }
        else {
            return a + prod2(a, b -1);
        }
    }
}
