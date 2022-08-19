package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_7.Library;

import java.util.ArrayList;
import java.util.List;

class Library {

    List<Book> books = new ArrayList<>();

    void takeBookFromLibrary(Book book) {
        if (books.contains(book)) {
            books.remove(book);
        } else {
            System.out.println("Book is unavailable");
        }
    }

    void returnBookToLibrary(Book book) {
        addBook(book);
    }

    Book findBook(Book book) {
        for (Book bookToFind : books) {
            if (book == bookToFind) {
                return book;
            } else {
                System.out.println("There is no book");
            }
        }
        return null;
    }

    void reserveBook(Book book) {

    }

    void addBook(Book book) {
        books.add(book);
    }

}
