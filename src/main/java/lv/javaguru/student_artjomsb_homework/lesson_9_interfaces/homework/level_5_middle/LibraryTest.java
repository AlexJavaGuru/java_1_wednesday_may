package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LibraryTest {
    public static void main(String[] args) {
        LibraryTest runner = new LibraryTest();
        runner.testAddBook();
        runner.testCannotAddBook();
        runner.testCannotAddBookWithoutParameter();
        runner.testCannotAddBookWithoutParameterTwo();
        runner.testCannotAddBookWithoutParameterThree();
        runner.testDeleteBook();
        runner.testCannotDeleteBook();
        runner.testGetAllBooks();
        runner.testFindByAuthor();
        runner.testFindByTitle();
        runner.testMarkAsRead();
        runner.testCannotMarkAsRead();
        runner.testCannotMarkAsReadTwo();
        runner.testMarkAsNotRead();
        runner.testCannotMarkAsNotRead();
        runner.testCannotMarkAsNotReadTwo();
        runner.testGetAllNotReadBooks();
        runner.testGetAllReadBooks();
    }

    void testAddBook() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        boolean result = bookReader.addBook(book1);
        check(result, " Test add book");
    }

    void testCannotAddBook() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        bookReader.addBook(book1);
        boolean result = bookReader.addBook(book1);
        check(!result, " Test cannot add book, cuz it already added");
    }

    void testCannotAddBookWithoutParameter() {
        Library bookReader = new BookReader();
        Book book1 = new Book();
        boolean result = bookReader.addBook(book1);
        check(!result, " Test cannot add book, cuz no parameter");
    }

    void testCannotAddBookWithoutParameterTwo() {
        Library bookReader = new BookReader();
        Book book1 = new Book();
        book1.setAuthor("Author1");
        boolean result = bookReader.addBook(book1);
        check(!result, " Test cannot add book, cuz no Title");
    }

    void testCannotAddBookWithoutParameterThree() {
        Library bookReader = new BookReader();
        Book book1 = new Book();
        book1.setNameOfBook("Title1");
        boolean result = bookReader.addBook(book1);
        check(!result, " Test cannot add book, cuz no Author");
    }

    void testDeleteBook() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        bookReader.addBook(book1);
        boolean result = bookReader.deleteBook(book1);
        check(result, " Test delete book");
    }

    void testCannotDeleteBook() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        boolean result = bookReader.deleteBook(book1);
        check(!result, " Test cannot delete book,cuz it not exist in Library");
    }

    void testGetAllBooks() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book2, book3));
        List<Book> actualResult = bookReader.getBookList();
        check(expectedResult.equals(actualResult), " Test get list of books");
    }

    void testFindByAuthor() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book3));
        List<Book> actualResult = bookReader.findBooksByAuthor("Author1");
        check(expectedResult.equals(actualResult), " Test find by author");
    }

    void testFindByTitle() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "NotTitle2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book3));
        List<Book> actualResult = bookReader.findBooksByName("Tit");
        check(expectedResult.equals(actualResult), " Test find by title");
    }

    void testMarkAsRead() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean result = bookReader.markBookAsRead(book2);
        check(result, " Test mark as read");
    }

    void testCannotMarkAsRead() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.markBookAsRead(book2);
        boolean result = bookReader.markBookAsRead(book2);
        check(!result, " Test cannot mark as read, cuz book already marked");
    }

    void testCannotMarkAsReadTwo() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book3);
        boolean result = bookReader.markBookAsRead(book2);
        check(!result, " Test cannot mark as read,cuz book is not exist");
    }

    void testMarkAsNotRead() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean result = bookReader.markBookAsNotRead(book2);
        check(result, " Test mark as not read");
    }

    void testCannotMarkAsNotRead() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.markBookAsNotRead(book2);
        boolean result = bookReader.markBookAsNotRead(book2);
        check(!result, " Test cannot mark as not read, cuz book already marked");
    }

    void testCannotMarkAsNotReadTwo() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book3);
        boolean result = bookReader.markBookAsNotRead(book2);
        check(!result, " Test cannot mark as not read,cuz book is not exist");
    }

    void testGetAllNotReadBooks() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.markBookAsNotRead(book2, book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book2, book3));
        List<Book> actualResult = bookReader.getNotReadBookList();
        check(expectedResult.equals(actualResult), " Test get list of not read books");
    }

    void testGetAllReadBooks() {
        Library bookReader = new BookReader();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.markBookAsRead(book2, book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book2, book3));
        List<Book> actualResult = bookReader.getReadBookList();
        check(expectedResult.equals(actualResult), " Test get list of read books");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
