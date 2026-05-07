package book_borrow_system;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("==========| Library Menu |==========");
            System.out.println("1. Display Book");
            System.out.println("2. Borrow Book");

            System.out.print("Choose option: ");
            int op = scanner.nextInt();

            switch (op){
                case 1:
                    lib.displayBook();
                    break;
                case 2:
                    lib.borrowBook();
                    break;
                case 3:
                    System.out.println("Program excited!");
                    return;
            }
        }
    }
}
