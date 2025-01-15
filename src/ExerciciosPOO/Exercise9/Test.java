package ExerciciosPOO.Exercise9;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("Tv-21\'",2500,11111);
        Product product2 = new Product("Fone-JBL",150,22222);
        Product product3 = new Product("PC GAMER",4000,33333);
        Product product4 = new Product("Fogão-6B",500,44444);
        Product product5 = new Product("Xre 300",30000,55555);
        Product product6 = new Product("CG 150",20000,66666);
        Product product7 = new Product("Ranger Rover",500000,77777);
        Product product8 = new Product("Macan",1500000,88888);

        Order order1 = new Order(12345);
        order1.addProduct(product5);
        order1.addProduct(product3);
        order1.addProduct(product1);
        order1.applyDiscount(20);
        SalesSystem.processPayment(order1,PaymentMethod.CREDIT_CARD);
    }
}
