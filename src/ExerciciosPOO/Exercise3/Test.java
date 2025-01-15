package ExerciciosPOO.Exercise3;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.processPayment();
        System.out.println("------------");
        CreditCard creditcard = new CreditCard();
        creditcard.processPayment();
    }
}
