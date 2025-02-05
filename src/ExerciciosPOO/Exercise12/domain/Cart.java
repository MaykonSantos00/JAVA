package ExerciciosPOO.Exercise12.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private Customer customer;

    public Cart(Customer customer) {
        this.customer = customer;
        products = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                ", customer=" + customer +
                '}';
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calcularTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void finalizePurchase() {
        if (products.isEmpty()) {
            System.out.println("\"Cart empty! Add products before checking out.\"");
        } else {
            System.out.println("Purchase completed successfully!");
            System.out.println("Custome: " + customer.getName());
            System.out.println("Products purchased:");
            products.forEach(System.out::println);
            System.out.println("Total: R$ " + String.format("%.2f", calcularTotal()));
            products.clear(); // Limpa o carrinho após finalizar a compra
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
}
