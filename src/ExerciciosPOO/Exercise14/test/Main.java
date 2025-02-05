package ExerciciosPOO.Exercise14.test;

import ExerciciosPOO.Exercise14.domain.*;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Mercedes", TypeofFuel.DIESEL, 10);
        Motorcycle motorcycle = new Motorcycle("Xre", TypeofFuel.GASOLINE, 20);
        Car car = new Car("MacLaren", TypeofFuel.ELECTRICITY, 10);

        Driver driver = new Driver("Geronimo",bus);
        Driver driver2 = new Driver("Neymar",car);
        Driver driver3 = new Driver("Geronimo",motorcycle);

        Trip trip1 = new Trip("Belém", "New York",1000,driver2);
        Trip trip2 = new Trip("Belém", "Fortaleza",250,driver3);
        Trip trip3 = new Trip("Belém", "Belo Horizonte",1000,driver);

        double priceFuel = 6.10;
        trip1.displayTrip(priceFuel);
        System.out.println();
        trip2.displayTrip(priceFuel);
        System.out.println();
        trip3.displayTrip(priceFuel);

    }
}
