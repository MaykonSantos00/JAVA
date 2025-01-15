package ExerciciosPOO.Exercise8;

public class CommissionedEmployee extends Employee {
    private double commission;
    private TypeEmployee typeEmployee;

    public CommissionedEmployee(String name, double salaryBase, double commission, TypeEmployee typeEmployee) {
        super(name, salaryBase);
        this.commission = commission;
        this.typeEmployee = typeEmployee;
    }

    @Override
    public String toString() {
        return "CommissionedEmployee{" +
                "Name='" + getName() + '\'' +
                "SalaryBase=" + getSalaryBase() +
                "TypeEmployee=" + typeEmployee +
                "commission=" + commission +
                ", Salary=" + calcularSalario() +
                '}';
    }

    @Override
    public double calcularSalario() {
        return getSalaryBase() + (getSalaryBase() * commission / 100);
    }

    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    public double getCommission() {
        return commission;
    }
}
