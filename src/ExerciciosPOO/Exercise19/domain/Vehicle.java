package ExerciciosPOO.Exercise19.domain;

public abstract class Vehicle implements Maintenance {
    private String plate;
    private FuelType fuelType;
    private double mileage;

    public Vehicle(String plate, FuelType fuelType, double mileage) {
        this.plate = plate;
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "plate='" + plate + '\'' +
                ", fuelType=" + fuelType +
                ", mileage=" + mileage;
    }

    public String getPlate() {
        return plate;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getMileage() {
        return mileage;
    }

    public void registerTravel(double distance) {
        if (distance < 0) {
            System.out.println("Invalid Distance");
        }
        this.mileage += distance;
    }

    public abstract void performMaintenance();


}
