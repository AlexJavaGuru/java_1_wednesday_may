package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_31;

import java.util.ArrayList;

class BookRepository {

    ArrayList<Book> books = new ArrayList<>();

    void addBookInLibrary(Book book) {
        books.add(book);
    }

    void takeBookFromLibrary(Book book, User user) {
        if (user.getCountOfBooks() < 3) {
            if (user.getDebt() == 0) {
                if (books.contains(book)) {
                    books.remove(book);
                    System.out.println("You took the book: " + book);
                    user.setCountOfBooks(user.getCountOfBooks() + 1);
                    books.remove(book);
                } else {
                    System.out.println("Sorry, we don't have this book, or these books finished");
                }
            } else {
                System.out.println("You have a debt: " + user.getDebt());
            }
        } else {
            System.out.println("You also took 2 books");
        }
    }

    void letBookBackToLibrary(Book book, User user) {
        if (user.getCountOfBooks() > 0) {
            books.add(book);
            user.setCountOfBooks(user.getCountOfBooks() - 1);
            System.out.println("Thank you, we hope you enjoyed reading this book");
        } else {
            System.out.println("You don't have book");
        }

    }

}
