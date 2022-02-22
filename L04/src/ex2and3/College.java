package ex2and3;

import java.util.*;

public class College {

    private String name;

    College(String name) {
        this.name = name;
    }

    private final Map<Integer, Student> students = new LinkedHashMap<Integer, Student>();

    //------------------------------------------------

    public String getName() {
        return name;
    }

    public LinkedHashMap<Integer, Student> getStudents() {
        return new LinkedHashMap<Integer, Student>(students);
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student) {
        students.remove(student.getStudentNo(), student);
    }

    public double calcAverage(){

//        double tempGrades = 0;
//        double tempAvg = 0;
//        double combAvg = 0;
//
//        for (Student s: students) {
//            for(int grade : s.getGrades()) {
//                tempGrades += grade;
//                tempAvg = tempGrades / s.getGrades().size();
//            }
//            combAvg += tempAvg;
//
//            tempGrades = 0;
//            tempAvg = 0;
//        }
//
//        return combAvg / students.size();

        double tempGrades = 0;
        double combAvg = 0;

        for (Student s : students.values()) {
            for(int grade : s.getGrades()) {
                tempGrades += grade;
            }
            combAvg += tempGrades / s.getGrades().size();

            tempGrades = 0;
        }
        return combAvg / students.size();
    }

    public Student findStudent(int StudentNo) {

//        Student student = null;
//
//        for (Student s : students) {
//            if (s.getStudentNo() == StudentNo) {
//                student = s;
//            }
//        }
//        return student;

        return students.get(StudentNo);
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
