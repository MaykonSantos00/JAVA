package ExerciciosPOO.Exercise14.domain;

public class Driver {
    private String name;
    private Vehicle vehicle;

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
