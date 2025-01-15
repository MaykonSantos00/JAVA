package ExerciciosPOO.Exercise2;

public class Employee extends Person {
    private int salary;

    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayPeople(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }
}
