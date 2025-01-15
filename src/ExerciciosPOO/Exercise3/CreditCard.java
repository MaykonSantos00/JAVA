package ExerciciosPOO.Exercise3;

public class CreditCard implements  Payment {

    @Override
    public void processPayment() {
        System.out.println("Your credit card payment was successful");
    }
}
