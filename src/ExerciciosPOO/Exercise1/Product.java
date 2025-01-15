package ExerciciosPOO.Exercise1;

public class Product {
    private String name;
    private double price;
    private int QuantityInStock;

    public Product(String name, double price, int QuantityInStock) {
        this.name = name;
        this.price = price;
        this.QuantityInStock = QuantityInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", QuantityInStock=" + QuantityInStock +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price must be a positive number");
            return;
        }
        this.price = price;
    }

    public int getQuantityInStock() {
        return QuantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            System.out.println("Quantity in stock must be a positive number");
            return;
        }
        QuantityInStock = quantityInStock;
    }
}
