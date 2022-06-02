package ex2;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        PersonCollection pc = new PersonCollection();

        Person p1 = new Person("Anders Andersen");
        Person p2 = new Person("Hans Hansen");
        Person p3 = new Person("Jens Jensen");
        Person p4 = new Person("Mikkel Mikkelsen");
        Person p5 = new Person("Jane Jensen");
        Person p6 = new Person("Alma Jensen");

        pc.add(p1);
        pc.add(p2);
        pc.add(p3);
        pc.add(p4);
        pc.add(p5);

        pc.add(3,p6);

//
//        System.out.println(pc.size());
//        System.out.println(pc.contains(p2));
//        System.out.println(pc.isEmpty());
//        System.out.println(pc.remove(1));
//        System.out.println(pc.contains(p2));
//        System.out.println(pc.get(3));

        Iterator<Person> iterator = pc.iterator();

        while(iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

    }
}
