package Week1.Module2DataStructuresAndAlgorithms.Ex6LibraryManagementSystem;

import java.util.Arrays;

public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }

    // Linear Search to find a book by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Binary Search to find a book by title (Assumes books array is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid]; // Book found
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }

    public static void main(String[] args) {
        // Sample books
        Book[] books = {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "To Kill a Mockingbird", "Harper Lee"),
            new Book(4, "The Catcher in the Rye", "J.D. Salinger"),
            new Book(5, "Pride and Prejudice", "Jane Austen")
        };

        // Sorting books by title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        LibraryManagementSystem library = new LibraryManagementSystem(books);

        // Linear search for a book
        System.out.println("Linear Search:");
        Book book = library.linearSearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");

        // Binary search for a book
        System.out.println("\nBinary Search:");
        book = library.binarySearchByTitle("The Catcher in the Rye");
        System.out.println(book != null ? book : "Book not found");
    }
}
