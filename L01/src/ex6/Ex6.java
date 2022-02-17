package ex6;

public class Ex6 {
    public static void main(String[] args) {

        System.out.println(gcd(54,24));

    }

    public static int gcd(int a, int b) {

        if (a < 2 || b < 2) {
            return -1;
        } else if (b <= a && (a % b == 0)) {
            return b;
        } else if (a < b) {
            return gcd(b,a);
        } else {
            return gcd(b, (a % b));
        }
    }
}
