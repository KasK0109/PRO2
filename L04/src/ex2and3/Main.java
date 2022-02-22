package ex2and3;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        College col1 = new College("Harvard");

        Student stu1 = new Student(1,"Mike Johnson", List.of(7,4,4,2,7,10,12));
        Student stu2 = new Student(2,"John Peterson", List.of(2,0,2,7,12,12,12));
        Student stu3 = new Student(3, "Hans", List.of(7,7,7,7,7,7,7,7));
        Student stu4 = new Student(4, "Karsten", List.of(4,4,4,4,4,4,4,4));
        Student stu5 = new Student(5, "Ulla", List.of(10,10,10,10,10,10,10));
        Student stu6 = new Student(6, "Lil Uzi Vert", List.of(2,2,2,2,2,2,2));
        Student stu7 = new Student(7, "Juice WRLD", List.of(12,12,12,12,12,12,12));
        Student stu8 = new Student(8, "xXxTentacion", List.of(4,2,7,10,4,4,4,4));
        Student stu9 = new Student(9, "Quavo", List.of(7,7,7,7,7,7,7));
        Student stu10 = new Student(10, "TakeOff", List.of(4,4,4,4,4,4,4));

        col1.addStudent(stu1);
        col1.addStudent(stu2);

        System.out.printf("%2.1f",col1.calcAverage());
        System.out.println();
        System.out.println(col1.getStudents());
        System.out.println(col1.findStudent(2));

        Set<Student> s = new TreeSet<>(new StudentComparator());
        s.add(stu3);
        s.add(stu4);
        s.add(stu5);
        s.add(stu6);
        s.add(stu7);
        s.add(stu8);
        s.add(stu9);
        s.add(stu10);
        System.out.println(s);

        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
        System.out.println(stu3.hashCode());
    }
}
