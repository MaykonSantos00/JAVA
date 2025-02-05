package ExerciciosPOO.Exercise18.test;

import ExerciciosPOO.Exercise18.domain.Cart;
import ExerciciosPOO.Exercise18.domain.Customer;
import ExerciciosPOO.Exercise18.domain.Order;
import ExerciciosPOO.Exercise18.domain.Product;
import POO.Ppolimorfismo.dominio.Produto;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Pc-Gamer", 100 ,5000);
        Product product2 = new Product("TV-60\'", 100 ,5000);

        Customer customer = new Customer("John", "john@gmail.com");
        System.out.println(customer);

        Cart cart = new Cart();

        Order order1 = new Order(product1,10);
        Order order2 = new Order(product2,10);

        cart.addOrder(order1);
        cart.addOrder(order2);

        cart.displayCart();

        cart.finishCart();

    }
}
