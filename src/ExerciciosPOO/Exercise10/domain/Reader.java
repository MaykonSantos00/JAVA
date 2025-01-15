package ExerciciosPOO.Exercise10.domain;

import java.util.ArrayList;
import java.util.List;

public class Reader extends User{
    private List<Book> borrowedBooks;

    public Reader(int id, String name) {
        super(id, name, TypeUser.READER);
        borrowedBooks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Reader{" +
                "Name: " + getName() +
                "Id: " + getId() +
                "TypeUser: " + getType() +
                "borrowedBooks=" + borrowedBooks +
                '}';
    }

    public void lendBook(Book book){
        if (book.isAvailable()){
            book.lend();
            borrowedBooks.add(book);
        }else{
            throw new IllegalStateException("Book unavailable for loan");
        }
    }

    public void returnBook(Book book){
        if (borrowedBooks.remove(book)){
            book.returnBook();
        }else{
            throw new IllegalStateException("This book was not borrowed by this user.");
        }
    }
}
