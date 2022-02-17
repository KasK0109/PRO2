package ex3;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(56);
        list.add(45);
        list.add(34);
        list.add(15);
        list.add(12);
        list.add(34);
        list.add(44);

        mergesort(list);
        System.out.println(list);
    }

    private static void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    private static void merge(ArrayList<Integer> list, int l, int m, int h) {

        ArrayList<Integer> temp = new ArrayList<>();

        int i1 = l;
        int i2 = m + 1;
        while (i1 < m && i2 < h + 1) {
            if (list.get(i1) <= list.get(i2)) {
                temp.add(list.get(i1));
                i1++;
            } else {
                temp.add(list.get(i2));
                i2++;
            }
        }

        while (i1 < m) {
            temp.add(list.get(i1));
            i1++;
        }

        while (i2 < h + 1) {
            temp.add(list.get(i2));
            i2++;
        }

        for (int i = 0; i < temp.size(); i++) {
            list.set(l + i, temp.get(i));
        }
    }

    public static void mergesort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }
}
