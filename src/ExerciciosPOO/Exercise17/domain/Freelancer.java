package ExerciciosPOO.Exercise17.domain;

public class Freelancer extends Employee {
    private double valueHour;
    private double hoursWorked;

    public Freelancer(String name, TypeOfEmployee typeOfEmployee) {
        super(name, typeOfEmployee);
    }

    public Freelancer(String name, TypeOfEmployee typeOfEmployee, double valueHour, double hoursWorked) {
        super(name, typeOfEmployee);
        this.valueHour = valueHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return valueHour * hoursWorked;
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "valueHour=" + valueHour +
                ", hoursWorked=" + hoursWorked +
                ", salary=" + calculatePayment() +
                '}';
    }
}
