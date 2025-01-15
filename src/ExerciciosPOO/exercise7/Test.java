package ExerciciosPOO.exercise7;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book(11111,"Hora de Aventura","Di Caprio", StatusBook.BORROWED );
        Book book2 = new Book(22222, "O Poder do Hábito", "Di Caprio", StatusBook.AVAILABLE );
        Book book3 = new Book(33333, "Mindset", "Di Caprio", StatusBook.AVAILABLE );
        Book book4 = new Book(44444, "Pai Rico Pai Pobre", "Di Caprio", StatusBook.AVAILABLE );

        User user1 = new User("Maykon Lindo", 21,11111);
        User user2 = new User("Michael Gostosao", 21,22222);
        User user3 = new User("Michael Perfeito", 21,33333);
        User user4 = new User("Michael A Lenda", 21,44444);

        user1.toLoanBook(book2);

    }
}
