package ExerciciosPOO.Exercise17.domain;

public class EmployeePJ extends Employee {
    private double valueContract;

    public EmployeePJ(String name, TypeOfEmployee typeOfEmployee) {
        super(name, typeOfEmployee);
    }

    public EmployeePJ(String name, TypeOfEmployee typeOfEmployee, double valueContract) {
        super(name, typeOfEmployee);
        this.valueContract = valueContract;
    }

    @Override
    public String toString() {
        return "EmployeePJ{" +
                super.toString() +
                "valueContract=" + valueContract +
                '}';
    }

    @Override
    public double calculatePayment() {
        return valueContract;
    }
}
