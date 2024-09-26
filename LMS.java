import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book class to represent a book object
class Book {
    private String isbn;
    private String title;
    private String author;
    private int pub_year;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, int pub_year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pub_year = pub_year;
        this.isAvailable = true; // New books are available by default
    }

    // Getters for book properties
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return pub_year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable; // Update availability status
    }
}

// Library class to manage a collection of books
class Library {
    private List<Book> books; // List to store the books

    public Library() {
        books = new ArrayList<>(); // Initialize the book list
    }

    public void addBook(Book book) {
        books.add(book); // Add book to the collection
        System.out.println("Book Added Successfully...");
    }

   
}

public class LMS {
    public static void main(String args[]) {
        Library library = new Library(); // Create a new Library instance
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        int choice;

        do {
            System.out.println("------Library Management System------");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Available Books");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice :");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Adding a new book
                    System.out.println("Enter ISBN Number");
                    String isbn = scanner.nextLine();
                    System.out.println("Enter Title");
                    String title = scanner.nextLine();
                    System.out.println("Enter Author");
                    String author = scanner.nextLine();
                    System.out.println("Enter the Publication Year");
                    int pub_year = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character

                    Book book = new Book(isbn, title, author, pub_year);
                    library.addBook(book);
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner resource
    }
}
