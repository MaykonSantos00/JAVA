package ExerciciosPOO.Exercise14.domain;

public class Car extends Vehicle {

    public Car(String model, TypeofFuel typeFuel, double averageConsumption) {
        super(model, typeFuel, averageConsumption);
    }

    @Override
    public double travelCost(double distance, double priceFuel) {
        return (distance / getAverageConsumption()) * priceFuel;
    }


}
