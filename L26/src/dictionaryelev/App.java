package dictionaryelev;

public class App {
    public static void main(String[] args) {

        DictionaryLinked<Integer, Integer> dictionaryLinked = new DictionaryLinked<>();
        dictionaryLinked.put(1,1);
        dictionaryLinked.put(2,2);
        System.out.println(dictionaryLinked);
    }
}
