package ex2and3;

import java.util.List;

public class Student implements Comparable<Student>{

    private int StudentNo;
    private String name;
    private List<Integer> grades;

    public Student(int studentNo, String name, List<Integer> grades) {
        this.StudentNo = studentNo;
        this.name = name;
        this.grades = grades;
    }

    //---------------------------------------------------------------------


    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student: " +
                "StudentNo = " + StudentNo +
                "; Name = '" + name + '\'' +
                "; Grades = " + grades +
                '\n';
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.StudentNo, s.getStudentNo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Student) {
            Student other = (Student) o;
            return this.StudentNo == other.StudentNo;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return StudentNo;
    }

}
