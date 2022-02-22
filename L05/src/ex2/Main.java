package ex2;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Hans", 21);
        Person p2 = new Person("Ulla", 22);

        System.out.println("Navn: " + p1.getName() + " Alder: " + p1.getAge());
        System.out.println("Navn: " + p2.getName() + " Alder: " + p2.getAge());
    }
}
