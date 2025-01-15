package ExerciciosPOO.exercise7;

import java.io.Serializable;
import java.util.Scanner;

public class User extends Person implements ToLoan {
    private int idUser;
    Scanner input = new Scanner(System.in);

    public User(String name, int age, int idUser) {
        super(name, age);
        this.idUser = idUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public void toLoanBook(Book book) {
        int option;
        do {
            System.out.println("To loan book - [1]");
            System.out.println("Return book - [2]");
            System.out.println("Go Out - [0]");
            System.out.println("Write a option: ");
            option = input.nextInt();

            if (option == 1) {
                book.toLoan();
                System.out.println();
            }else if (option == 2) {
                book.returnBook();
                System.out.println();
            }else{
                System.out.println("Invalid option");
            }
            System.out.println();
        }while (option != 0);

        book.toLoan();
    }
}
