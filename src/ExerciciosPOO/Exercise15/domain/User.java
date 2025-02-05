package ExerciciosPOO.Exercise15.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private double balance;
    private List<Movement> movements;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.movements = new ArrayList<Movement>();
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", balance=" + balance +
//                ", movements=" + movements +
                '}';
    }

    public void addExpense(double value, Category category, String description) {
        Movement expense = new Expense(value, category, description);
        this.movements.add(expense);
        this.balance -= expense.getValue();
    }

    public void addRevenue(double value, Category category, String description) {
        Movement revenue = new Revenue(value, category, description);
        this.movements.add(revenue);
        this.balance += revenue.getValue();
    }

    public void displayMovements() {
        for (Movement movement : movements) {
            System.out.println(movement);
        }
        System.out.println("Current balance: R$" + this.balance);
    }

    public void categoryMovements(Category category) {
        System.out.println("\nCategory: " + category);
        for (Movement movement : movements) {
            if (movement.getCategory() == category) {
                System.out.println(movement);
            }
        }
    }


    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public List<Movement> getMovements() {
        return movements;
    }
}
