package ExerciciosPOO.Exercise11.domain;

public class Drink extends Product{

    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "Name: " + super.getName() +
                "Price " + super.getPrice() +
                "}";
    }


}
