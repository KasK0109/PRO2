package toh;

public class TOH {
    public static void main(String[] args) {
//        move(4,1,3);
        for (int n = 1; n <= 10; n++) {
            System.out.println("towers(" + n + "):");
            towers(n);
            System.out.println();
        }
    }


    public static void move(int n, int from, int to) {
        if (n == 1) {
            System.out.println("Move: " + from + " --> " + to);
        } else {
            int other = 6 - from - to;
            move(n - 1, from, other);
            System.out.println("Move: " + from + " --> " + to);
            move(n - 1, other, to);
        }
    }

    public static void towers(int n) {
        towers(n, 1, 3);
    }

    public static void towers(int n, int from, int to) {
        if (n == 1) {
            System.out.println("Move: " + from + " --> " + to);
        } else {
            int other = 6 - from - to;
            towers(n - 1, from, other);
            System.out.println("Move: " + from + " --> " + to);
            towers(n - 1, other, to);
        }
    }
}
