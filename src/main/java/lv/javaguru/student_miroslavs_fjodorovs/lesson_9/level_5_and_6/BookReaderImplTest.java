package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_5_and_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookReaderImplTest {

    public static void main(String[] args) {
        addBook();
        addSameBook();
        addBookWithNoTitleNoAuthor();
        removeBook();
        removeBookWithNoTitleNoAuthor();
        getAllBooks();
        getBooksByAuthor();
        getBooksByAuthorShortened();
        getBooksByTitle();
        getBooksByTitleShortened();
        markBookAsRead();
        markBookAsReadWithNoTitleNoAuthor();
        markBookAsUnread();
        markBookAsUnreadWithNoTitleNoAuthor();
        getBooksRead();
        getBooksUnread();
    }

    static void addBook() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        boolean result = subject.addBook(book1);
        check(result, "Add Book Test");
    }

    static void addSameBook() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        boolean result = subject.addBook(book2);
        check(!result, "Add Same Book Test");
    }

    static void addBookWithNoTitleNoAuthor() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book(null, null);
        boolean result = subject.addBook(book1);
        check(!result, "Add Book With No Title And No Author Test");
    }

    static void removeBook() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        boolean result = subject.removeBook(book1);
        check(result, "Remove Book Test");
    }

    static void removeBookWithNoTitleNoAuthor() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book(null, null);
        subject.addBook(book1);
        boolean result = subject.removeBook(book1);
        check(!result, "Remove Book With No Title And No Author Test");
    }

    static void getAllBooks() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));
        List<Book> realResult = subject.getAllBooks();
        check(expectedResult.equals(realResult), "Get All Books Test");
    }

    static void getBooksByAuthor() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book2));
        List<Book> realResult = subject.getBooksByAuthor("Erich Maria Remarque");
        check(expectedResult.equals(realResult), "Get Books By Author");
    }

    static void getBooksByAuthorShortened() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book2));
        List<Book> realResult = subject.getBooksByAuthor("Erich");
        check(expectedResult.equals(realResult), "Get Books By Author Shortened Version Test");
    }

    static void getBooksByTitle() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        List<Book> expectedResult = new ArrayList<>(List.of(book2));
        List<Book> realResult = subject.getBooksByTitle("Three Comrades");
        check(expectedResult.equals(realResult), "Get Books By Title Test");
    }

    static void getBooksByTitleShortened() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        List<Book> expectedResult = new ArrayList<>(List.of(book2));
        List<Book> realResult = subject.getBooksByTitle("Three");
        check(expectedResult.equals(realResult), "Get Books By Title Shortened Version Test");
    }

    static void markBookAsRead() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        boolean result = subject.markBookAsRead(book1);
        check(result, "Mark Book As Read Test");
    }

    static void markBookAsReadWithNoTitleNoAuthor() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book(null, null);
        subject.addBook(book4);
        subject.markBookAsRead(book4);
        boolean result = subject.markBookAsRead(book4);
        check(!result, "Mark Book With No Title And No Author As Read Test");
    }

    static void markBookAsUnread() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        boolean result = subject.markBookAsUnread(book3);
        check(result, "Mark Book As Unread Test");
    }

    static void markBookAsUnreadWithNoTitleNoAuthor() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book(null, null);
        subject.addBook(book4);
        subject.markBookAsUnread(book4);
        boolean result = subject.markBookAsUnread(book4);
        check(!result, "Mark Book With No Title And No Author As Unread Test");
    }

    static void getBooksRead() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        subject.markBookAsRead(book1);
        subject.markBookAsRead(book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book3));
        List<Book> realResult = subject.getAllReadBooks();
        check(expectedResult.equals(realResult), "Get All Read Books Test");
    }

    static void getBooksUnread() {
        BookReaderImpl subject = new BookReaderImpl();
        Book book1 = new Book("All Quiet on the Western Front", "Erich Maria Remarque");
        subject.addBook(book1);
        Book book2 = new Book("Three Comrades", "Erich Maria Remarque");
        subject.addBook(book2);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger");
        subject.addBook(book3);
        Book book4 = new Book("Nine Stories", "Jerome David Salinger");
        subject.addBook(book4);
        subject.markBookAsRead(book2);
        subject.markBookAsRead(book4);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book3));
        List<Book> realResult = subject.getAllUnreadBooks();
        check(expectedResult.equals(realResult), "Get All Unread Books Test");
    }

    static void check ( boolean condition, String testName){
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}


