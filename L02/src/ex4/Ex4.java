package ex4;

public class Ex4 {
    public static void main(String[] args) {
        printAnagrams("","word");
    }

    public static void printAnagrams(String prefix, String word) {

        if (word.length() == 0) {
            System.out.println(prefix);
        }
        for (int i = 0; i < word.length(); i++) {
            String newPrefix = prefix + word.charAt(i);
            String newWord = word.substring(0,i) + word.substring(i + 1);
            printAnagrams(newPrefix, newWord);
        }
    }
}
