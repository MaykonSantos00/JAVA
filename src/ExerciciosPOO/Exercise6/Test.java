package ExerciciosPOO.Exercise6;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Maykon", 21, "123455676787");
//        student.display();
//        System.out.println("-------------------------------");
        Teacher teacher = new Teacher("Maykon", 50, "Mathematics");
//        teacher.display();

        Person[] people = {student, teacher};
        for (Person p : people) {
            p.display();
            System.out.println();
        }
    }
}
