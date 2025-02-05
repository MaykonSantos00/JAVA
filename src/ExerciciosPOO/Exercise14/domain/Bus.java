package ExerciciosPOO.Exercise14.domain;

public class Bus extends Vehicle {

    public Bus(String model, TypeofFuel typeFuel, double averageConsumption) {
        super(model, typeFuel, averageConsumption);
    }

    @Override
    public double travelCost(double distance, double priceFuel) {
        return (distance / getAverageConsumption()) * priceFuel * 1.1;
    }
}
