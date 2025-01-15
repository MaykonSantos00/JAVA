package ExerciciosPOO.exercise7;

public class Book {
    private int id;
    private String title;
    private String author;
    private StatusBook status;

    public Book(int id, String title, String author, StatusBook status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public void toLoan(){
        if (status == null)return;
        System.out.println("Title: " + this.title);
        System.out.println("Status: " + getStatus());
        if (getStatus() == StatusBook.AVAILABLE) {
            System.out.println("You're Borrowed the Book");
            setStatus(StatusBook.BORROWED);
        }else{
            System.out.println("You can't Borrowed the Book");
        }
    }

    public void returnBook(){
        if (status == null)return;
        if (getStatus() == StatusBook.BORROWED) {
            System.out.println("You're Returned the Book");
            setStatus(StatusBook.AVAILABLE);
        }else{
            System.out.println("You can't Return the Book, because you can't Borrow the Book");
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public StatusBook getStatus() {
        return status;
    }

    public void setStatus(StatusBook status) {
        this.status = status;
    }
}
