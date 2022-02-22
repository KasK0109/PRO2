package ex2and3;

import java.util.ArrayList;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);

        System.out.println(zeroes(list));
    }

    public static int zeroes(ArrayList<Integer> list) {
        return zeroes(list, 0, list.size() - 1);
    }

    private static int zeroes(ArrayList<Integer> list, int l, int h) {

        if (l == h) {
            return list.get(l) == 0 ? 1 : 0;
//            if (list.get(l) == 0) {
//                return 1;
//            } else {
//                return 0;
//            }
        } else {
            int m = (l + h) / 2;
            int zeroes1 = zeroes(list, l, m);
            int zeroes2 = zeroes(list, m + 1, h);
            return zeroes1 + zeroes2;
        }
    }
}
