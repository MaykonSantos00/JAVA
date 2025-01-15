package ExerciciosPOO.Exercise11.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order implements Discountable {
    private List<Product> products;
    private String clientName;
    private PaymentMethod paymentMethod;
    Scanner input = new Scanner(System.in);

    public Order(String clientName, PaymentMethod paymentMethod) {
        this.clientName = clientName;
        this.paymentMethod = paymentMethod;
        products = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", clientName='" + clientName + '\'' +
                ", paymentMethod=" + paymentMethod +
                '}';
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double totalValue() {
        double totalValue = 0.0;
        for (Product product : products) {
            totalValue += product.getPrice();
        }
        int option;
        System.out.println("Do you have Discount coupon?");
        System.out.println("[1] - Yes or [2] - No");
        option = input.nextInt();
        if (option == 1) {
            int coupon;
            System.out.println("Write your coupon: ");
            coupon = input.nextInt();
            System.out.println("Your coupon is " + coupon + " = 10%");
            return totalValue - (totalValue * applyDiscount(10));
        } else if (option == 2) {
            return totalValue;
        }
        System.out.println("invalid option");
        return totalValue;
    }

    @Override
    public double applyDiscount(double percentage) {
        return (percentage / 100);
    }
}
