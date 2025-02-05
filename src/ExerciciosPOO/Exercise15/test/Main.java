package ExerciciosPOO.Exercise15.test;

import ExerciciosPOO.Exercise15.domain.Category;
import ExerciciosPOO.Exercise15.domain.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Maykon Tavares dos Santos", 5000);
        System.out.println(user);

        user.addRevenue(200, Category.WORK, "Work");
        user.addRevenue(500, Category.WORK, "Work");
        user.addExpense(2000, Category.TRANSPORT, "Travel");

        user.displayMovements();

        user.categoryMovements(Category.WORK);
    }
}
