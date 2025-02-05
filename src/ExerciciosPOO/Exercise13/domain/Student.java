package ExerciciosPOO.Exercise13.domain;

import java.util.Arrays;

public class Student extends Person {
    private double[] notes;
    private StatusStudent status;

    public Student(String name, int age, double[] notes) {
        super(name, age);
        this.notes = notes;
        checkApproval();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", notes=" + Arrays.toString(notes) +
                ", status=" + status +
                '}';
    }

    public double calculateAverage() {
        double total = 0;
        for (double note : notes) {
            total += note;
        }
        return total / notes.length;
    }

    private void checkApproval() {
        double average = calculateAverage();
        if (average >= 5.0) {
            this.status = StatusStudent.APPROVED;
        }else {
            this.status = StatusStudent.FAIL;
        }
    }


    public double[] getNotes() {
        return notes;
    }

    public StatusStudent getStatus() {
        return status;
    }
}
