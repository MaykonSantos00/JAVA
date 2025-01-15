package ExerciciosPOO.Exercise3;

public class Ticket implements  Payment{

    @Override
    public void processPayment() {
        System.out.println("Your ticket payment was successful");
    }
}
