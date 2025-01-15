package ExerciciosPOO.Exercise10.Test;

import ExerciciosPOO.Exercise10.domain.Administrator;
import ExerciciosPOO.Exercise10.domain.Book;
import ExerciciosPOO.Exercise10.domain.Reader;

import java.util.ArrayList;
import java.util.List;

public class DigitalLibrary {
    public static void main(String[] args) {
        List<Book> colletion = new ArrayList<>();

        Book book1 = new Book(1, "Robert", "rich dad poor dad", 10);
        Book book2 = new Book(2, "carol", "Mindset", 20);
        Book book3 = new Book(3, "charles", "the power of habit", 15);

        colletion.add(book1);
        colletion.add(book2);
        colletion.add(book3);

        Reader reader = new Reader(1, "Maykon");

        Administrator administrator = new Administrator(2, "Ana");

        System.out.println("initial collection\n");
        colletion.forEach(System.out::println);

        System.out.println("---------------------------");

        System.out.println("Maykon is lend the book:rich dad poor dad");
        reader.lendBook(book1);
        System.out.println(reader);

        System.out.println("---------------------------");

        System.out.println("new collection\n");
        colletion.forEach(System.out::println);

        System.out.println("Maykon is return the book:rich dad poor dad");
        reader.returnBook(book1);
        System.out.println(reader);

        System.out.println("---------------------------");

        System.out.println("new collection");
        colletion.forEach(System.out::println);

        System.out.println("---------------------------");

        Book book4 = new Book(4,"Mkzin","Harry Poter",5);
        System.out.println("Administrator add a new Book");
        administrator.addBook(colletion, book4);
        colletion.forEach(System.out::println);

        System.out.println("---------------------------");

        System.out.println("Administrator remove a book");
        administrator.removeBook(colletion, book4);
        colletion.forEach(System.out::println);
    }
}
