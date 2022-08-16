package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

public class BookReaderTest {

    public static void main(String[] args) {
        testAddSameBook();
        testAddNotSameBook();
        testAddBlankAuthorBook();
        testAddBlankTitleBook();
        removeSameObjectBook();
        removeAnotherObjectBook();
        testResultListSizeFindBooksByAuthor();
        testFindBooksByAuthor();
        testFindBooksByAuthorNameOnly();
    }

    private static void testFindBooksByAuthorNameOnly() {
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Alex Djuma", "Tri_mushketjora"));
        bookReader.addBook(new Book("Tugenev", "Mu-mu"));
        bookReader.addBook(new Book("Pushkin", "Skazka o carje"));
        bookReader.addBook(new Book("Alex Djuma", "20 let spustja"));
        String[] expectedTitles = new String[2];
        expectedTitles[0] = "Tri_mushketjora";
        expectedTitles[1] = "20 let spustja";
        Book[] resultList = bookReader.findBooksByAuthor("Alex").toArray(new Book[2]);
        for (int i = 0; i < resultList.length; i++) {
            check(
                    expectedTitles[i].equals(resultList[i].getTitle()),
                    "testFindBooksByAuthorNameOnly: " + i
            );
        }
    }

    private static void testFindBooksByAuthor() {
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Djuma", "Tri_mushketjora"));
        bookReader.addBook(new Book("Tugenev", "Mu-mu"));
        bookReader.addBook(new Book("Pushkin", "Skazka o carje"));
        bookReader.addBook(new Book("Djuma", "20 let spustja"));
        String[] expectedTitles = new String[2];
        expectedTitles[0] = "Tri_mushketjora";
        expectedTitles[1] = "20 let spustja";
        Book[] resultList = bookReader.findBooksByAuthor("Djuma").toArray(new Book[2]);
        for (int i = 0; i < resultList.length; i++) {
                check(
                        expectedTitles[i].equals(resultList[i].getTitle()),
                        "testFindBooksByAuthor: " + i
                );
        }
    }

    private static void testResultListSizeFindBooksByAuthor() {
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Djuma", "Tri_mushketjora"));
        bookReader.addBook(new Book("Tugenev", "Mu-mu"));
        bookReader.addBook(new Book("Pushkin", "Skazka o carje"));
        bookReader.addBook(new Book("Djuma", "20 let spustja"));
        List<String> expectedTitles = new ArrayList<>();
        expectedTitles.add("Tri_mushketjora");
        expectedTitles.add("20 let spustja");
        List<Book> resultList = bookReader.findBooksByAuthor("Djuma");
        check(
                resultList.size() == 2,
                "testResultListSizeFindBooksByAuthor"
        );
    }

    private static void removeAnotherObjectBook() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Djuma", "Tri_mushketjora");
        bookReader.addBook(book);
        check(
                bookReader.removeBook(new Book("Djuma", "Tri_mushketjora")),
                "removeAnotherObjectBook"
        );
    }

    private static void removeSameObjectBook() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Djuma", "Tri_mushketjora");
        bookReader.addBook(book);
        check(
                bookReader.removeBook(book),
                "removeSameObjectBook"
        );
    }

    private static void testAddBlankAuthorBook() {
        BookReader bookReader = new BookReaderImpl();
        check(
                !bookReader.addBook(new Book("", "Tri_mushketjora")),
                "testAddBlankAuthorBook"
        );
    }

    private static void testAddBlankTitleBook() {
        BookReader bookReader = new BookReaderImpl();
        check(
                !bookReader.addBook(new Book("Djuma", "")),
                "testAddBlankTitleBook"
        );
    }

    private static void testAddSameBook() {
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Djuma", "Tri_mushketjora"));
        check(
                !bookReader.addBook(new Book("Djuma", "Tri_mushketjora")),
                "testAddSameBook"
        );
    }

    private static void testAddNotSameBook() {
        BookReader bookReader = new BookReaderImpl();
        bookReader.addBook(new Book("Djuma", "Tri_mushketjora"));
        check(
                bookReader.addBook(new Book("Turgenev", "Mu-mu")),
                "testAddNotSameBook"
        );
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
