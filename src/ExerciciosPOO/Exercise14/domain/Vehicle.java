package ExerciciosPOO.Exercise14.domain;

public abstract class Vehicle {
    private String model;
    private TypeofFuel typeFuel;
    private double averageConsumption;

    public Vehicle(String model, TypeofFuel typeFuel, double averageConsumption) {
        this.model = model;
        this.typeFuel = typeFuel;
        this.averageConsumption = averageConsumption;
    }

    public abstract double travelCost(double distance, double priceFuel);

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", typeFuel=" + typeFuel +
                ", averageConsumption=" + averageConsumption +
                '}';
    }

    public String getModel() {
        return model;
    }

    public TypeofFuel getTypeFuel() {
        return typeFuel;
    }

    public double getAverageConsumption() {
        return averageConsumption;
    }
}
