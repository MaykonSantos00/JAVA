package ExerciciosPOO.Exercise17.test;

import ExerciciosPOO.Exercise17.domain.*;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[]{
                new EmployeeCLT("Maykon da net", TypeOfEmployee.DEVELOPER_BACK, 30000),
                new EmployeePJ("Matheuzin do grau", TypeOfEmployee.MANAGER, 50000),
                new Freelancer("Livyanzinha", TypeOfEmployee.DEVELOPER_FRONT, 100,200)
        };

        for (Employee employee : emp) {
            System.out.println(employee);
        }
    }
}
