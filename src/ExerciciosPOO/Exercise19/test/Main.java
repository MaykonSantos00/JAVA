package ExerciciosPOO.Exercise19.test;

import ExerciciosPOO.Exercise19.domain.Car;
import ExerciciosPOO.Exercise19.domain.FuelType;
import ExerciciosPOO.Exercise19.domain.Motorcycle;
import ExerciciosPOO.Exercise19.domain.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("XRF934", FuelType.ELECTRIC, 20000);
        Motorcycle motorcycle = new Motorcycle("XRE934", FuelType.GASOLINE, 40000);
        Truck truck = new Truck("PPE934", FuelType.DIESEL, 60000);

        car.registerTravel(10000);
        car.performMaintenance();
        car.checkOilLevel();

        motorcycle.performMaintenance();
        motorcycle.registerTravel(20000);

        truck.changeTires();
        truck.checkOilLevel();
        truck.registerTravel(1000000);
        truck.performMaintenance();

        System.out.println("\nVehicle States:");
        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(truck);

    }
}
