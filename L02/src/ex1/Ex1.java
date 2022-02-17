package ex1;

public class Ex1 {
    public static void main(String[] args) {
        printTable(9,9);

    }


    public static int binominal(int n, int m) {
        if ((n <= 0 || m <= 0) && m > n) {
            return 0;
        } else if (n == m || m == 0) {
            return 1;
        } else {
            return binominal(n - 1, m - 1) + binominal(n - 1, m);
        }
    }

    public static void printTable(int n, int m) {
        System.out.println("Table of K(n,m)");
        System.out.print("  m");
        for (int i = 0; i <= m; i++) {
            System.out.printf("%8s", i);
        }
        System.out.println();
        System.out.print("n ");
        for(int i = 0; i < m; i++) {
            System.out.print("----------");
        }
        System.out.println();
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                System.out.println();
                System.out.print(i + " |");
            } else {
                System.out.print(i + " |");
            }
            for (int j = 0; j <= m; j++) {
                if (binominal(i,j) != 0) {
                    System.out.printf("%8s", binominal(i, j));
                }
            }
        }
    }
}
