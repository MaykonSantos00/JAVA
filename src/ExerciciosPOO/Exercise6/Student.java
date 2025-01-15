package ExerciciosPOO.Exercise6;

public class Student extends Person {
    private String registration;

    public Student(String name, int age, String registration) {
        super(name, age);
        this.registration = registration;
    }

    @Override
    public void display() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Registration: " + registration);

    }

    public String getRegistration() {
        return registration;
    }
}
