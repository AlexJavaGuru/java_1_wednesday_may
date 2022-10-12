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
        assertEquals(Arrays.toString(expectResult1), subject.getBooksByAuthor("J.K. Rowling"), "Full author name Test");

        Book[] expectResult2 = {book1, book2};
        assertEquals(Arrays.toString(expectResult2), subject.getBooksByAuthor("Mart"), "Part of author name Test");
    }

    @Test
    void testGetBookByTitle() {
        Book book1 = new Book("Fire & Blood", "George R. R. Martin");
        Book book2 = new Book("The Winds of Winter", "George R. R. Martin");
        Book book3 = new Book("Philosopher's Stone", "J.K. Rowling");
        Book book4 = new Book("Deathly Hallows", "J.K. Rowling");
        subject.addBook(book1);
        subject.addBook(book2);
        subject.addBook(book3);
        subject.addBook(book4);
        Book[] expectResult1 = {book1};
        assertEquals(Arrays.toString(expectResult1), subject.getBooksByTitle("Fire & Blood"), "Full title Test");

        Book[] expectResult2 = {book4};
        assertEquals(Arrays.toString(expectResult2), subject.getBooksByTitle("Hallow"), "Part of title Test");
    }

    @Test
    void testMarkBookAsReadAndUnread() {
        Book book = new Book("Head First Java", "Kathy Sierra & Bert Bates");
        subject.addBook(book);
        assertTrue(subject.markBookAsRead(book), "Book is read Test");
        assertTrue(subject.markBookAsUnread(book), "Book is unread Test");
    }

    @Test
    void testGetAllReadAndUnreadBooks() {
        Book book1 = new Book("Fire & Blood", "George R. R. Martin");
        Book book2 = new Book("The Winds of Winter", "George R. R. Martin");
        Book book3 = new Book("Philosopher's Stone", "J.K. Rowling");
        Book book4 = new Book("Deathly Hallows", "J.K. Rowling");
        Book book5 = new Book("Head First Java", "Kathy Sierra & Bert Bates");
        subject.addBook(book1);
        subject.addBook(book2);
        subject.addBook(book3);
        subject.addBook(book4);
        subject.addBook(book5);
        subject.markBookAsRead(book1);
        subject.markBookAsRead(book5);
        Book[] expectResult1 = {book1, book5};
        assertEquals(Arrays.toString(expectResult1), subject.getAllReadBooks(), "Get all read books Test");

        Book[] expectResult2 = {book2, book3, book4};
        assertEquals(Arrays.toString(expectResult2), subject.getAllUnreadBooks(), "Get all unread books Test");
    }
}
