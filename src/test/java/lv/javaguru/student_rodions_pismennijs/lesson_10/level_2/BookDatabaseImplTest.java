package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.AuthorSearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.OrSearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.SearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.YearOfIssueSearchCriteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    BookDatabaseImpl subject;

    @BeforeEach
    void setUp() {
        subject = new BookDatabaseImpl();
    }

    @Test
    void testSave() {
        Book book = new Book("one title", "one author", "2000");
        Long expected = 1L;
        Long actual = subject.save(book);
        assertEquals(expected, actual, "Save test");
    }

    @Test
    void testDelete() {
        Book book1 = new Book("one title", "one author", "2000");
        Book book2 = new Book("two title", "two author", "2000");
        subject.save(book1);
        subject.save(book2);
        assertTrue(subject.delete(1L), "Delete id test");
        assertTrue(subject.delete(book2), "Delete object test");
    }

    @Test
    void testFindById() {
        subject.save(new Book("one title", "one author", "2000"));
        assertTrue(subject.findById(1L).isPresent(), "Find by id test");
    }

    @Test
    void testFindByAuthor() {
        subject.save(new Book("one title", "one author", "2000"));
        subject.save(new Book("two title", "one author", "2000"));
        subject.save(new Book("three title", "one author", "2000"));
        List<Book> byAuthor = subject.findByAuthor("one author");
        assertEquals(3, byAuthor.size(), "Find author books test");
    }

    @Test
    void testFindByTitle() {
        subject.save(new Book("one title", "one author", "2000"));
        subject.save(new Book("one title", "two author", "2000"));
        List<Book> byTitle = subject.findByTitle("one title");
        assertEquals(2, byTitle.size(), "Find author books test");
    }

    @Test
    void testCountAllBooks() {
        subject.save(new Book("one title", "one author", "2000"));
        subject.save(new Book("two title", "two author", "2000"));
        subject.save(new Book("three title", "three author", "2000"));
        subject.save(new Book("three title", "three author", "2000"));
        assertEquals(3, subject.countAllBooks(), "Count all books test + unique test");
    }

    @Test
    void testDeleteByAuthor() {
        subject.save(new Book("one title", "one author", "2000"));
        subject.save(new Book("two title", "one author", "2000"));
        subject.save(new Book("three title", "two author", "2000"));
        subject.deleteByAuthor("one author");
        assertEquals(1, subject.countAllBooks(), "Delete by author test");
    }

    @Test
    void testDeleteByTitle() {
        subject.save(new Book("one title", "one author", "2000"));
        subject.save(new Book("one title", "two author", "2000"));
        subject.save(new Book("two title", "three author", "2000"));
        subject.deleteByTitle("two title");
        assertEquals(2, subject.countAllBooks(), "Delete by title test");
    }

    @Test
    void testFindByCriteria() {
        subject.save(new Book("one title", "one author", "2000"));
        subject.save(new Book("two title", "two author", "1980"));
        subject.save(new Book("three title", "three author", "1980"));
        SearchCriteria author = new AuthorSearchCriteria("some authors");
        SearchCriteria year = new YearOfIssueSearchCriteria("1980");
        SearchCriteria searchCriteria = new OrSearchCriteria(author, year);
        List<Book> books = subject.find(searchCriteria);
        assertEquals(2, books.size(), "Find by criteria test");
    }

    @Test
    void testFindUniqueAuthors() {
        subject.save(new Book("one title", "one author", "1960"));
        subject.save(new Book("two title", "one author", "1980"));
        subject.save(new Book("three title", "two author", "1996"));
        subject.save(new Book("four title", "two author", "2002"));
        Set<String> uniqueAuthors = subject.findUniqueAuthors();
        assertEquals(2, uniqueAuthors.size(), "Find unique authors test");
    }

    @Test
    void testFindUniqueTitles() {
        subject.save(new Book("one title", "one author", "1960"));
        subject.save(new Book("one title", "two author", "1980"));
        subject.save(new Book("two title", "three author", "1996"));
        subject.save(new Book("three title", "four author", "2002"));
        Set<String> uniqueTitles = subject.findUniqueTitles();
        assertEquals(3, uniqueTitles.size(), "Find unique titles test");
    }

    @Test
    void testFindUniqueBooks() {
        subject.save(new Book("one title", "one author", "1960"));
        subject.save(new Book("one title", "two author", "1980"));
        subject.save(new Book("two title", "one author", "1996"));
        subject.save(new Book("three title", "four author", "1996"));
        subject.save(new Book("three title", "four author", "1996"));
        Set<Book> uniqueBooks = subject.findUniqueBooks();
        assertEquals(4, uniqueBooks.size(), "Find unique books test");
    }

    @Test
    void testContains() {
        subject.save(new Book("one title", "one author", "1960"));
        Book book2 = new Book("one title", "one author", "1960");
        assertTrue(subject.contains(book2), "Book contains test");
    }

    @Test
    void testGetAuthorToBooksMap() {
        subject.save(new Book("one title", "one author", "1960"));
        subject.save(new Book("two title", "one author", "1980"));
        subject.save(new Book("three title", "one author", "1996"));
        subject.save(new Book("four title", "two author", "1996"));
        subject.save(new Book("five title", "three author", "1996"));
        Map<String, List<Book>> authorToBooksMap = subject.getAuthorToBooksMap();
        assertEquals(3, authorToBooksMap.get("one author").size());
        assertEquals(1, authorToBooksMap.get("two author").size());
        assertEquals(1, authorToBooksMap.get("three author").size());
    }

    @Test
    void testGetEachAuthorBookCount() {
        subject.save(new Book("one title", "one author", "1960"));
        subject.save(new Book("two title", "one author", "1980"));
        subject.save(new Book("three title", "one author", "1996"));
        subject.save(new Book("four title", "two author", "1996"));
        subject.save(new Book("five title", "three author", "1996"));
        Map<String, Integer> eachAuthorBookCount = subject.getEachAuthorBookCount();
        assertTrue(eachAuthorBookCount.containsKey("one author"));
        assertTrue(eachAuthorBookCount.containsValue(3));
        assertTrue(eachAuthorBookCount.containsKey("two author"));
        assertTrue(eachAuthorBookCount.containsValue(1));
    }
}
