package ExerciciosPOO.Exercise14.domain;

public class Trip {
    private String origin, destination;
    private double distance;
    private Driver driver;

    public Trip(String origin, String destination, double distance, Driver driver) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.driver = driver;
    }

    public void displayTrip(double priceFuel){
        double cost = driver.getVehicle().travelCost(distance, priceFuel);
        System.out.println("Trip of " + origin + " to " + destination);
        System.out.println("Distance: " + distance + "km");
        System.out.println(driver);
        System.out.println("Cost: R$ " + String.format("%.2f", cost));
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistance() {
        return distance;
    }

    public Driver getDriver() {
        return driver;
    }
}
