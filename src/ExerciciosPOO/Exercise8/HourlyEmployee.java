package ExerciciosPOO.Exercise8;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;
    private TypeEmployee typeEmployee;


    public HourlyEmployee(String name, double salaryBase, double hoursWorked, double hourlyRate, TypeEmployee typeEmployee) {
        super(name, salaryBase);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.typeEmployee = typeEmployee;
    }

    @Override
    public String toString() {
        return "CommissionedEmployee{" +
                "Name='" + getName() + '\'' +
                "SalaryBase=" + getSalaryBase() +
                "TypeEmployee=" + typeEmployee +
                "hoursWorked=" + hoursWorked +
                "hourlyRate=" + hourlyRate +
                ", Salary=" + calcularSalario() +
                '}';
    }

    @Override
    public double calcularSalario() {
        return hoursWorked * hourlyRate;
    }

    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
