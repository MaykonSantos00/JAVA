package ExerciciosPOO.Exercise10.domain;

public class Book {
    private int id;
    private String author;
    private String title;
    private int copiesAvailable;

    public Book(int id, String author, String title, int copiesAvailable) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.copiesAvailable = copiesAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", copiesAvailable=" + copiesAvailable +
                '}';
    }

    public boolean isAvailable(){
        return this.copiesAvailable > 0;
    }

    public void lend() {
        if (isAvailable()) {
            copiesAvailable--;
        } else {
            throw new IllegalStateException("Nenhuma cópia disponível para empréstimo.");
        }
    }

    public void returnBook() {
        copiesAvailable++;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}
