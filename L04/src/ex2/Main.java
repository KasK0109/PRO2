package ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        College col1 = new College("Harvard");

        Student stu1 = new Student(1,"Mike Johnson", List.of(7,4,4,2,7,10,12));
        Student stu2 = new Student(2,"John Peterson", List.of(2,0,2,7,12,12,12));

        col1.addStudent(stu1);
        col1.addStudent(stu2);

        System.out.println(col1.calcAverage());
        System.out.println(col1.getStudents());
        System.out.println(col1.findStudent(2));
    }
}
