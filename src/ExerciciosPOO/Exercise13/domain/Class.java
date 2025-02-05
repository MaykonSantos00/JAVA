package ExerciciosPOO.Exercise13.domain;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Class(String name,Teacher teacher) {
        this.teacher = teacher;
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void displayReport() {
        System.out.println("Name: " + this.name);
        System.out.println("Teacher: " + this.teacher);
        System.out.println("------ Students ------");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }
}
