package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Tests;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.*;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.AndSearchCriteria;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.AuthorSearchCriteria;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.SearchCriteria;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.TitleSearchCriteria;

import java.util.*;

class BookDataBaseTest {

    public static void main(String[] args) {
        testSave();
        testRemove();
        testFindById();
        testFindByAuthor();
        testFindByTitle();
        testCountAllBooks();
        testDeleteByAuthor();
        testDeleteByTitle();
        testFind();
        testFindUniqueAuthors();
        testFindUniqueTitles();
        testFindUniqueBooks();
        testContains();
        testGetAuthorToBooksMap();
        testGetEachAuthorBookCount();
    }

    static void testSave() {
        Book book = new Book("Example", "Example", null);
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        Long result = dataBase.save(book);
        check(result == 1, "Test Save");
    }

    static void testRemove() {
        Book book = new Book("Example", "Example", null);
        Book book2 = new Book("Example1", "Example1", null);
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(book2);
        boolean result = dataBase.delete(1L);
        boolean result2 = dataBase.delete(book2);
        check(result && result2, "Test Remove");
    }

    static void testFindById() {
        Book book = new Book("Example", "Example", null);
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        Optional<Book> result =  dataBase.findById(1L);
        check(result.isPresent(), "Test Find By Id");
    }

    static void testFindByAuthor() {
        Book book = new Book("Example", "Volume 1", null);
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        List<Book> result = dataBase.findByAuthor("Example");
        check(result.contains(book), "Test Find By Author");
    }

    static void testFindByTitle() {
        Book book = new Book("Example", "Volume 1", null);
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        List<Book> result = dataBase.findByTitle("Volume 1");
        check(result.contains(book), "Test Find By Title");
    }

    static void testCountAllBooks() {
        Book book = new Book("Example", "Volume 1", null);
        Book bookTwo = new Book("Example", "Volume 1", null);
        Book bookThree = new Book("Example", "Volume 1", null);
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(bookTwo);
        dataBase.save(bookThree);
        int result = dataBase.countAllBooks();
        check(result == 3, "Test Count All Books");
    }

    static void testDeleteByAuthor() {
        Book book = new Book("Example", "Volume 1", null);
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.deleteByAuthor("Example");
        check(dataBase.findByAuthor("Example") == null, "Test Delete By Author");
    }

    static void testDeleteByTitle() {
        Book book = new Book("Example", "Volume 1", null);
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.deleteByTitle("Volume 1");
        check(dataBase.findByTitle("Volume 1") == null, "Test Delete By Title");
    }

    static void testFind() {
        SearchCriteria searchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Example"),
                new TitleSearchCriteria("Volume 1"));
        Book book = new Book("Example", "Volume 1", "1909");
        Book book2 = new Book("Example", "Volume 1", "1920");
        Book book3 = new Book("Example2", "Volume 1", "2000");
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(book2);
        dataBase.save(book3);
        List<Book> result = dataBase.find(searchCriteria);
        check(result.contains(book) && result.contains(book2), "Test Find");
    }

    static void testFindUniqueAuthors() {
        Book book = new Book("Example", "Volume 1", "1909");
        Book book2 = new Book("Example", "Volume 2", "1920");
        Book book3 = new Book("Example", "Volume 3", "2000");
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(book2);
        dataBase.save(book3);
        Set<String> result = dataBase.findUniqueAuthors();
        check(result.contains(book.getAuthor()) && result.contains(book2.getAuthor()) &&
                result.contains(book3.getAuthor()), "Test Find Unique Authors");
    }

    static void testFindUniqueTitles() {
        Book book = new Book("Example", "Volume 1", "1909");
        Book book2 = new Book("Example", "Volume 1", "1920");
        Book book3 = new Book("Example", "Volume 3", "2000");
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(book2);
        dataBase.save(book3);
        Set<String> result = dataBase.findUniqueTitles();
        check(result.contains(book.getTitle()) && result.contains(book2.getTitle()) &&
                result.contains(book3.getTitle()), "Test Find Unique Titles");
    }

    static void testFindUniqueBooks() {
        Book book = new Book("Example", "Volume 1", "1909");
        Book book2 = new Book("Example", "Volume 1", "1920");
        Book book3 = new Book("Example", "Volume 3", "2000");
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(book2);
        dataBase.save(book3);
        Set<Book> result = dataBase.findUniqueBooks();
        check(result.contains(book) && result.contains(book2) && result.contains(book3), "Test Find Unique Books");
    }

    static void testContains() {
        Book book = new Book("Example", "Volume 1", "1909");
        Book book2 = new Book("Example", "Volume 1", "1920");
        Book book3 = new Book("Example", "Volume 3", "2000");
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(book2);
        dataBase.save(book3);
        boolean result = dataBase.contains(book);
        check(result, "Test Contains");
    }

    static void testGetAuthorToBooksMap() {
        Book book = new Book("Example", "Volume 1", "1909");
        Book book2 = new Book("Example", "Volume 2", "1920");
        Book book3 = new Book("Example1", "Volume 3", "1925");
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(book2);
        dataBase.save(book3);
        Map<String, List<Book>> result = dataBase.getAuthorToBooksMap();
        check(result.containsKey("Example") && result.containsKey("Example1"),
                "Test Get Author To Books Map");
    }

    static void testGetEachAuthorBookCount() {
        Book book = new Book("Example", "Volume 1", "1909");
        Book book2 = new Book("Example", "Volume 2", "1920");
        Book book3 = new Book("Example1", "Volume 3", "1925");
        BookDataBaseImpl dataBase = new BookDataBaseImpl();
        dataBase.save(book);
        dataBase.save(book2);
        dataBase.save(book3);
        Map<String, Integer> result = dataBase.getEachAuthorBookCount();
        check(result.containsValue(1) && result.containsValue(2),
                "Test Get Each Author Books Count");
    }

    static void check(boolean result, String taskName) {
        if(result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
