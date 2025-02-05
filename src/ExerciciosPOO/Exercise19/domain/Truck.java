package ExerciciosPOO.Exercise19.domain;

public class Truck extends Vehicle {
    public Truck(String plate, FuelType fuelType, double mileage) {
        super(plate, fuelType, mileage);
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "}";
    }

    @Override
    public void performMaintenance() {
        System.out.println("General maintenance of the Truck performed");
    }


    @Override
    public void checkOilLevel() {
        System.out.println("Verified Truck oil level");
    }

    @Override
    public void changeTires() {
        System.out.println("Truck tires changed");
    }
}
