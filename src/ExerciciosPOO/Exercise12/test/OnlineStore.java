package ExerciciosPOO.Exercise12.test;

import ExerciciosPOO.Exercise12.domain.Cart;
import ExerciciosPOO.Exercise12.domain.Category;
import ExerciciosPOO.Exercise12.domain.Customer;
import ExerciciosPOO.Exercise12.domain.Product;

public class OnlineStore {
    public static void main(String[] args) {
        Product product1 = new Product("Pc Gamer", 5000, Category.ELECTRONICS);
        Product product2 = new Product("Shoulder Bag", 200, Category.CLOTHES);
        Product product3 = new Product("Sheets", 5000, Category.HOUSEHOLD);
        Product product4 = new Product("Drill", 5000, Category.ELECTRONICS);

        Customer customer = new Customer("Maykon", "Passagem miraci,67");

        Cart cart = new Cart(customer);
        cart.addProduct(product1);
        cart.addProduct(product2);
        System.out.println(cart);

        System.out.println("\nCart total: R$ " + String.format("%.2f", cart.calcularTotal()));

        System.out.println("\nRemoving product 'Pc Gamer' of cart...");
        cart.removeProduct(product1);

        System.out.println("\ncart total after removal: R$ " + String.format("%.2f", cart.calcularTotal()));

        System.out.println("\nFinalizing Purchase...");
        cart.finalizePurchase();

        System.out.println("\nTrying to complete purchase again...");
        cart.finalizePurchase();
    }
}
