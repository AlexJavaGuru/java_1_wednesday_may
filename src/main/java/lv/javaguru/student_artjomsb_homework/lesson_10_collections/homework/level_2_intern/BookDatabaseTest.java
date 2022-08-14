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

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
