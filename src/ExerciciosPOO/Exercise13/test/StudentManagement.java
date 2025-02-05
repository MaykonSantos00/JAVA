package ExerciciosPOO.Exercise13.test;

import ExerciciosPOO.Exercise13.domain.Class;
import ExerciciosPOO.Exercise13.domain.Student;
import ExerciciosPOO.Exercise13.domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {

        Student student1 = new Student("Maykon", 21, new double[]{4,5,6,7});
        Student student2 = new Student("Livyan", 23, new double[]{8,9.5,7,10});
        Student student3 = new Student("Eistein", 21, new double[]{10,10,10,10});

        Teacher teacher = new Teacher("Geraldo", 50, "mathematics");

        Class c1 = new Class("9º Year", teacher);

        c1.addStudents(student1);
        c1.addStudents(student2);
        c1.addStudents(student3);

        c1.displayReport();
    }
}
