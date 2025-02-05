package ExerciciosPOO.Exercise17.domain;

public class EmployeeCLT extends Employee {
    private double salary;

    public EmployeeCLT(String name, TypeOfEmployee typeOfEmployee) {
        super(name, typeOfEmployee);
    }

    public EmployeeCLT(String name, TypeOfEmployee typeOfEmployee, double salary) {
        super(name, typeOfEmployee);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeCLT{" +
                super.toString() +
                "salary=" + salary +
                '}';
    }

    @Override
    public double calculatePayment() {
        return salary;
    }

    public double getSalary() {
        return salary;
    }
}
