package ExerciciosPOO.Exercise13.domain;

public class Teacher extends Person {
    private String object;

    public Teacher(String name, int age, String object) {
        super(name, age);
        this.object = object;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", object='" + object + '\'' +
                '}';
    }

    public String getObject() {
        return object;
    }
}
