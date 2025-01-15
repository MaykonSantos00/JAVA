package ExerciciosPOO.Exercise11.domain;

public class Plate extends Product{

    public Plate(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "Name: " + super.getName() +
                "Price " + super.getPrice() +
                "}";
    }
}
