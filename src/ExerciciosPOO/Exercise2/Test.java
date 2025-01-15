package ExerciciosPOO.Exercise2;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Maykon", 21);
        Customer customer = new Customer("Maykinho", 21);

        employee.setSalary(3000);
        customer.setIdCustomer("12345");

//        employee.displayPeople();
//        System.out.println("-------------");
//        customer.displayPeople();

        Person[] people = {employee, customer};
        for (Person p : people) {
            p.displayPeople();
            System.out.println();
        }
    }
}
