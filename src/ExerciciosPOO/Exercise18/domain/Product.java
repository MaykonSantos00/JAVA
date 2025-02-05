package ExerciciosPOO.Exercise18.domain;

public class Product {
    private String name;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + name + '\'' +
                ", Stock =" + stock +
                ", preco=" + price +
                '}';
    }

    public boolean reduceStock(int quantity){
        if(quantity > stock){
            return false;
        }
        stock -= quantity;
        return true;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
}
