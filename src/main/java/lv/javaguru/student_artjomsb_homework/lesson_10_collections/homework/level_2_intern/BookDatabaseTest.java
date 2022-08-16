package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest runner = new BookDatabaseTest();
        runner.testSave();
        runner.testDeleteByID();
        runner.testCannotDeleteByID();
        runner.testDeleteBook();
        runner.testNotDeleteBook();
        runner.testFindByID();
        runner.testNotFindByID();
        runner.testFindByAuthor();
        runner.testNotFindByAuthor();
        runner.testFindByTitle();
        runner.testNotFindByTitle();
        runner.testFirstCountBook();
        runner.testSecondCountBook();
        runner.testDeleteByAuthor();
        runner.testNotDeleteByAuthor();
        runner.testDeleteByTitle();
        runner.testNotDeleteByTitle();
    }

    void testSave() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book2));
        boolean result = database.save(book1) == 1 && database.save(book2) == 2 && expectedList.equals(database.getBooks());
        check(result, "Test book saving");
    }

    void testDeleteByID() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book3));
        boolean result = database.delete(2L) && database.getBooks().equals(expectedList);
        check(result, "Test deleting the book by ID");
    }

    void testCannotDeleteByID() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book2, book3));
        boolean result = !database.delete(4L) && database.getBooks().equals(expectedList);
        check(result, "Test not deleting the book by ID");
    }

    void testDeleteBook() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book3));
        boolean result = database.delete(book2) && database.getBooks().equals(expectedList);
        check(result, "Test deleting the book");
    }

    void testNotDeleteBook() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book3));
        boolean result = !database.delete(book2) && database.getBooks().equals(expectedList);
        check(result, "Test not deleting the book");
    }

    void testFindByID() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        Optional<Book> expectedResult = Optional.of(book2);
        Optional<Book> actualResult = database.findById(2L);
        check(expectedResult.equals(actualResult), "Test find book by ID");
    }

    void testNotFindByID() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        Optional<Book> expectedResult = Optional.empty();
        Optional<Book> actualResult = database.findById(4L);
        check(expectedResult.equals(actualResult), "Test not find book by ID");
    }

    void testFindByAuthor() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book3));
        List<Book> result = database.findByAuthor("Author1");
        check(result.equals(expectedList), "Test Find books by Author");
    }

    void testNotFindByAuthor() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>();
        List<Book> result = database.findByAuthor("Author3");
        check(result.equals(expectedList), "Test not Find books by Author");
    }

    void testFindByTitle() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book3));
        List<Book> result = database.findByTitle("Title1");
        check(result.equals(expectedList), "Test Find books by Title");
    }

    void testNotFindByTitle() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>();
        List<Book> result = database.findByTitle("Title3");
        check(result.equals(expectedList), "Test not Find books by Title");
    }

    void testFirstCountBook() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        int expectedResult = 3;
        int result = database.countAllBooks();
        check(result == expectedResult, "Test count books");
    }

    void testSecondCountBook() {
        BookDatabase database = new BookDatabaseImpl();
        int expectedResult = 0;
        int result = database.countAllBooks();
        check(result == expectedResult, "Test count books");
    }

    void testDeleteByAuthor() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book3));
        database.deleteByAuthor("Author2");
        check(database.getBooks().equals(expectedList), "Test delete books by Author");
    }

    void testNotDeleteByAuthor() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book2, book3));
        database.deleteByAuthor("Author3");
        check(database.getBooks().equals(expectedList), "Test not delete books by Author");
    }

    void testDeleteByTitle() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book3));
        database.deleteByTitle("Title2");
        check(database.getBooks().equals(expectedList), "Test delete books by Title");
    }

    void testNotDeleteByTitle() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedList = new ArrayList<>(Arrays.asList(book1, book2, book3));
        database.deleteByTitle("Author3");
        check(database.getBooks().equals(expectedList), "Test not delete books by Title");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
