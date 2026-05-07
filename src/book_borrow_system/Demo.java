package book_borrow_system;

public class Demo {
    public static void main(String[] args) {
        Library lib = new Library("Jomnes Library");

        Book b = new Book(101, "Love Language", false);
        Book b1 = new Book(102, "Dare to failed", true);
        Book b2 = new Book(101, "Dudu Story", true);

        // add book into arraylist
        lib.addBook(b);
        lib.addBook(b1);
        lib.addBook(b2);

        // display
        lib.displayBook();
        lib.borrowBook();
    }
}
