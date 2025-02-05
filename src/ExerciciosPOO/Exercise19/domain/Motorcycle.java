package ExerciciosPOO.Exercise19.domain;

public class Motorcycle extends Vehicle {
    public Motorcycle(String plate, FuelType fuelType, double mileage) {
        super(plate, fuelType, mileage);
    }

    @Override
    public String toString() {
        return "Motorcyle{" +
                super.toString() +
                "}";
    }

    @Override
    public void performMaintenance() {
        System.out.println("General maintenance of the Motorcycle performed");
    }

    @Override
    public void checkOilLevel() {
        System.out.println("Verified Motorcycle oil level");
    }

    @Override
    public void changeTires() {
        System.out.println("Motorcycle tires changed");
    }
}
