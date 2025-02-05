package ExerciciosPOO.Exercise18.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Order> orders;

    public Cart() {
        this.orders = new ArrayList<Order>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void displayCart(){
        System.out.println("Shopping Cart:");
        for (Order order : this.orders) {
            System.out.println(order);
        }
    }

    public void finishCart(){
        System.out.println("Finishing Purchasing...");
        for (Order order : this.orders) {
            order.processOrder();
        }
        System.out.println("Purchase finished!");
    }

}
