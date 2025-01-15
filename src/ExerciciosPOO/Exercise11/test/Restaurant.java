package ExerciciosPOO.Exercise11.test;

import ExerciciosPOO.Exercise11.domain.Drink;
import ExerciciosPOO.Exercise11.domain.Order;
import ExerciciosPOO.Exercise11.domain.PaymentMethod;
import ExerciciosPOO.Exercise11.domain.Plate;

public class Restaurant {
    public static void main(String[] args) {
        Drink drink1 = new Drink("Coca", 10);
        Drink drink2 = new Drink("Fanta-Uva", 9);
        Plate plate1 = new Plate("Beef and cream", 20);
        Plate plate2 = new Plate("rice with chicken ", 15);

        Order order = new Order("Maykon", PaymentMethod.PIX);
        order.addProduct(drink1);
        order.addProduct(plate2);
        System.out.println(order);

        System.out.println("Total Value: R$" + order.totalValue());



    }
}
