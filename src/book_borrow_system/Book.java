package book_borrow_system;

public class Book {
    int id;
    String title;
    boolean isBorrowed;

    public Book(int id, String title, boolean isBorrowed){
        this.id = id;
        this.title = title;
        this.isBorrowed = isBorrowed;
    }
}
