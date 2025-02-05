package ExerciciosPOO.Exercise19.domain;

public class Car extends Vehicle {
    public Car(String plate, FuelType fuelType, double mileage) {
        super(plate, fuelType, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "}";
    }

    @Override
    public void performMaintenance() {
        System.out.println("General maintenance of the car performed");
    }


    @Override
    public void checkOilLevel() {
        System.out.println("Verified car oil level");
    }

    @Override
    public void changeTires() {
        System.out.println("Car tires changed");
    }
}
