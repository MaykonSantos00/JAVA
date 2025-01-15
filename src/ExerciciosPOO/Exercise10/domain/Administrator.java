package ExerciciosPOO.Exercise10.domain;

import java.util.List;

public class Administrator extends User{

    public Administrator(int id, String name) {
        super(id, name, TypeUser.ADMINISTRATOR);
    }



    public void addBook(List<Book> collection, Book book){
        collection.add(book);
    }

    public void removeBook(List<Book> collection, Book book){
        collection.remove(book);
    }

}
