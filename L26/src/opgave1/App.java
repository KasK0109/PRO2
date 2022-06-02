package opgave1;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        HashSet<Bil> bilHashSet = new HashSet<>();

        Bil bil1 = new Bil("AA00000", "BMW", "i8", "Hvid");
        Bil bil2 = new Bil("AA00001", "Mercedes", "C-klasse", "Sort");
        Bil bil3 = new Bil("BB11222", "Alfa Romeo", "Quatro", "Rød");
        Bil bil4 = new Bil("CC22333", "Audi", "Q-4 eTron", "Blå");
        Bil bil5 = new Bil("DD33444", "Volkswagen", "Golf", "Orange");
        Bil bil6 = new Bil("EE44555", "Volkswagen", "Polo", "Hvid");
        Bil bil7 = new Bil("EE44555", "Volkswagen", "Polo", "Hvid");
        Bil bil8 = new Bil("AA00000", "BMW", "i8", "Hvid");
        Bil bil9 = new Bil("FF55666", "Ford", "F150", "Sort");
        Bil bil10 = new Bil("GG66777", "Rolls-Royce", "Phantom", "Ivory");

        bilHashSet.add(bil1);
        bilHashSet.add(bil2);
        bilHashSet.add(bil3);
        bilHashSet.add(bil4);
        bilHashSet.add(bil5);
        bilHashSet.add(bil6);
        bilHashSet.add(bil7);
        bilHashSet.add(bil8);
        bilHashSet.add(bil9);
        bilHashSet.add(bil10);

        for (Bil bil:
             bilHashSet) {
            System.out.println(bil.toString());
        }
    }
}
