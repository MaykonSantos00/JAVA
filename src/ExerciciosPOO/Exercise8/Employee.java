package ExerciciosPOO.Exercise8;

public abstract class Employee {
    private String name;
    private double salaryBase;

    public Employee(String name, double salaryBase) {
        this.name = name;
        this.salaryBase = salaryBase;
    }

    public abstract double calcularSalario();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }

}
