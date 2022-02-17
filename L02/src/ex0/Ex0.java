package ex0;

import java.util.ArrayList;

public class Ex0 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(10);
        list.add(9);
        list.add(7);
        list.add(8);

        System.out.println(even(list));

    }

    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0);
    }

    private static int sum(ArrayList<Integer> list, int index) {
        int result;
        if(index == list.size()) {
            result = 0;
        }
        else {
            result = list.get(index) + sum(list, index + 1);
        }
        return result;
    }

    public static int even(ArrayList<Integer> list) {
        return even(list,0);
    }

    private static int even(ArrayList<Integer> list, int index) {

        int result;
        if (index == list.size()) {
            result = 0;
        } else if(list.get(index) % 2 == 0) {
            result = 1 + even(list,index + 1);
        } else {
            result = even(list, index + 1);
        }
        return result;
    }
}
