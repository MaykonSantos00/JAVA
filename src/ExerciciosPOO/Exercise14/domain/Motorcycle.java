package ExerciciosPOO.Exercise14.domain;

public class Motorcycle extends Vehicle {

    public Motorcycle(String model, TypeofFuel typeFuel, double averageConsumption) {
        super(model, typeFuel, averageConsumption);
    }

    @Override
    public double travelCost(double distance, double priceFuel) {
        return (distance / getAverageConsumption()) * priceFuel;
    }
}
