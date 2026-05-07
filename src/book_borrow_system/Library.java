package book_borrow_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    String libraryName;
    ArrayList<Book> books;

    public Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        for (Book b : books){
            if (b.id == book.id){
                System.out.println("Duplicated ID!!! Try new ones!");
                return;
            }
        }
        books.add(book);
    }

    public void displayBook(){
        System.out.println("Library name: " + libraryName);
        System.out.println("List books:");

        for (Book b : books){
            System.out.println("Book ID: " + b.id + "\t" +
                               "Book Title: " + b.title + "\t" +
                               "Borrow: " + b.isBorrowed
            );
        }
    }

    public void borrowBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book id to borrow: ");
        int bId = scanner.nextInt();
        boolean found = false;

        for (Book b : books){
            if (bId == b.id){
                found = true;
                if (b.isBorrowed){
                    System.out.println("Book already borrowed!!");
                } else {
                    b.isBorrowed = true;
                    System.out.println("Book borrowed successfully.");
                }
                break;
            }
        }
        if (!found){
            System.out.println("Book not found!");
        }
    }
}
