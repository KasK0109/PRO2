package ex1;

import java.util.*;

public class UseMethodsWithHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.addAll(List.of(34,12,23,45,67,34,98));

//        set.add(34);
//        set.add(12);
//        set.add(23);
//        set.add(45);
//        set.add(67);
//        set.add(34);
//        set.add(98);

        System.out.println("Original set: " + set);

        set.add(23);
        System.out.println("Add 23: " + set);

        set.remove(67);
        System.out.println("Remove 67: " + set);

        System.out.println("Set contains 67: " + set.contains(23));

        System.out.println("Number of elements in the set: " + set.size());
    }


}
