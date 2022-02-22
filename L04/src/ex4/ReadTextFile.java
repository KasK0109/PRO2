package ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ReadTextFile{

    public static void main(String[] args) throws FileNotFoundException {

        SortedSet<String> s = new TreeSet();

        String fileName = "C:\\Users\\kaare\\IdeaProjects\\PRO2\\L04\\src\\ex4\\Gjoengehoevdingen.txt";
        File f = new File(fileName);

        Scanner scan = new Scanner(f);
        int count = 0;
        try {
            scan.useDelimiter("[\\W && [^æøåÆØÅ]]+");
            scan.useDelimiter("[\\.,?!;:\"\\s-]+");
            while (scan.hasNext()   ) {
                String word = scan.next();
                s.add(word);
                count++;
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }

        for (var word : s) {
            System.out.println(word);
        }

        scan.close();

        System.out.println(count);
        System.out.println(s.size());

    }


//    public void readTextFile() throws FileNotFoundException {
//
//        Set<String> s = new TreeSet();
//
//        String fileName = "C:\\Users\\kaare\\IdeaProjects\\PRO2\\L04\\src\\ex4\\Gjoengehoevdingen";
//        File f = new File(fileName);
//
//        Scanner scan = new Scanner(f);
//        try {
//            while (scan.hasNext()) {
//                String word = scan.next();
//                s.add(word);
//            }
//        } catch(Exception ex) {
//            System.out.println(ex);
//        }
//
//        scan.close();
//
//        System.out.println(s);
//        System.out.println(s.size());
//    }
}
