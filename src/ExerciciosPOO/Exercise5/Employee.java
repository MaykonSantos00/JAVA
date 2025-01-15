package ExerciciosPOO.Exercise5;

import java.util.Locale;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        if(percentage < 0 )return;
        percentage /= 100;
        this.salary += (this.salary*percentage);
    }

    public void displayInformations(){
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Salary: " + this.salary);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return this.position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
