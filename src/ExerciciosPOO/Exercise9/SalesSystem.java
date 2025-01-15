package ExerciciosPOO.Exercise9;

public class SalesSystem {
    public static void processPayment(Order order, PaymentMethod paymentMethod) {
        System.out.println("Loading Order...");
        System.out.println("Chosen Payment Method: " + paymentMethod);
        System.out.println("Final Value: R$" + order.getTotalValue());
        System.out.println("Payment completed successfully!");
    }
}
