package lv.javaguru.student_rodions_pismennijs.lesson_9.level_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookReaderImplTest {

    BookReaderImpl subject;

    @BeforeEach
    void setUp() {
        subject = new BookReaderImpl();
    }

    @Test
    void testAddBook() {
        Book book1 = new Book("Fire & Blood", "George R. R. Martin");
        assertTrue(subject.addBook(book1), "Add book Test");

        Book book2 = new Book("Fire & Blood", "George R. R. Martin");
        Book book3 = new Book("The Winds of Winter", "George R. R. Martin");
        Book book4 = new Book("Fire & Blood", "George R. R. Martin");
        Book book5 = new Book("The Winds of Winter", "George R. R. Martin");
        subject.addBook(book2);
        subject.addBook(book3);
        subject.addBook(book4);
        subject.addBook(book5);
        assertEquals(2, subject.books.size(), "Unique books Test");

        Book book6 = new Book("Harry Potter", null);
        assertFalse(subject.addBook(book6), "Book need to have title and author Test");
    }

    @Test
    void testRemoveBook() {
        Book book1 = new Book("Fire & Blood", "George R. R. Martin");
        subject.addBook(book1);
        assertTrue(subject.removeBook(book1), "Remove book Test");
    }

    @Test
    void testGetAllBooks() {
        Book book1 = new Book("Fire & Blood", "George R. R. Martin");
        Book book2 = new Book("The Winds of Winter", "George R. R. Martin");
        Book book3 = new Book("Philosopher's Stone", "J.K. Rowling");
        Book book4 = new Book("Deathly Hallows", "J.K. Rowling");
        subject.addBook(book1);
        subject.addBook(book2);
        subject.addBook(book3);
        subject.addBook(book4);
        Book[] expectResult = {book1, book2, book3, book4};
        assertEquals(Arrays.toString(expectResult), subject.getAllBooks(), "Get all books Test");
    }

    @Test
    void testGetBookByAuthor() {
        Book book1 = new Book("Fire & Blood", "George R. R. Martin");
        Book book2 = new Book("The Winds of Winter", "George R. R. Martin");
        Book book3 = new Book("Philosopher's Stone", "J.K. Rowling");
        Book book4 = new Book("Deathly Hallows", "J.K. Rowling");
        subject.addBook(book1);
        subject.addBook(book2);
        subject.addBook(book3);
        subject.addBook(book4);
        Book[] expectResult1 = {book3, book4};
        assertEquals(Arrays.toString(expectResult1), subject.getBookByAuthor("J.K. Rowling"), "Full author name Test");

        Book[] expectResult2 = {book1, book2};
        assertEquals(Arrays.toString(expectResult2), subject.getBookByAuthor("Mart"), "Part of author name Test");
    }
}
