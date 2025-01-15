package ExerciciosPOO.Exercise5;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Maykon", "Dev", 30000);
        employee.displayInformations();
        employee.increaseSalary(10000);
        System.out.println("------------------------");
        employee.displayInformations();
    }
}
