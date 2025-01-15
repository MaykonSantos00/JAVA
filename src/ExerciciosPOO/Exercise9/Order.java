package ExerciciosPOO.Exercise9;

import java.util.ArrayList;
import java.util.List;

public class Order implements Discountable {
    private int id;
    private List<Product> products;
    private double totalValue;

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
        this.totalValue = 0.0;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        this.totalValue += product.getPrice();
    }

    public void applyDiscount(double discount) {
        this.totalValue -= this.totalValue * (discount / 100);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public double getTotalValue() {
        return totalValue;
    }
}
