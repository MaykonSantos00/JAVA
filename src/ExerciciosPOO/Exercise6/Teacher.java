package ExerciciosPOO.Exercise6;

import javax.security.auth.Subject;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Subject: " + subject);

    }

    public String getSubject() {
        return subject;
    }
}
