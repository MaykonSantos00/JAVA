package ExerciciosPOO.Exercise2;

public class Customer extends Person {
    private String idCustomer;

    public Customer(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayPeople(){
        System.out.println("Name: " + getName());
        System.out.println("IdCustomer: " + getIdCustomer());
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
}
