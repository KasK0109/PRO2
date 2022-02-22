package ex2and3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student stu1, Student stu2) {
        return stu1.getName().compareTo(stu2.getName());
    }
}
