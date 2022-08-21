package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.search_criteria.*;

import java.util.*;

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
        runner.testFindCriteriaAuthor();
        runner.testFindCriteriaTitle();
        runner.testFindCriteriaYear();
        runner.testFindCriteriaOrCriteria();
        runner.testFindCriteriaAndCriteria();
        runner.testFindUniqueAuthorsDifferent();
        runner.testFindUniqueAuthorsSame();
        runner.testFindUniqueTitleDifferent();
        runner.testFindUniqueTitleSame();
        runner.testFindUniqueBooks();
        runner.testFindUniqueBooksEmpty();
        runner.testContains();
        runner.testNotContains();
        runner.testGetEachAuthorBookCount();
        runner.testGetAuthorToBooksMap();
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

    private void testFindCriteriaOrCriteria() {
        BookDatabase database = new BookDatabaseImpl();
        SearchCriteria titleCriteria = new TitleSearchCriteria("Title3");
        SearchCriteria authorCriteria = new AuthorSearchCriteria("Author1");
        SearchCriteria orCriteria = new OrSearchCriteria(titleCriteria, authorCriteria);
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book3));
        check(expectedResult.equals(database.find(orCriteria)), "Test find by author or title criteria");

    }

    private void testFindCriteriaAndCriteria() {
        BookDatabase database = new BookDatabaseImpl();
        SearchCriteria titleCriteria = new TitleSearchCriteria("Title1");
        SearchCriteria authorCriteria = new AuthorSearchCriteria("Author3");
        SearchCriteria andCriteria = new AndSearchCriteria(titleCriteria, authorCriteria);
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedResult = new ArrayList<>(List.of(book3));
        check(expectedResult.equals(database.find(andCriteria)), "Test find by author and title criteria");

    }

    private void testFindCriteriaYear() {
        BookDatabase database = new BookDatabaseImpl();
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1999");
        Book book1 = new Book("Author1", "Title1", "1999");
        Book book2 = new Book("Author2", "Title2", "2007");
        Book book3 = new Book("Author3", "Title3", "1999");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book3));
        check(expectedResult.equals(database.find(yearCriteria)), "Test find by year criteria");

    }

    private void testFindCriteriaTitle() {
        BookDatabase database = new BookDatabaseImpl();
        SearchCriteria titleCriteria = new TitleSearchCriteria("Title1");
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title1");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book3));
        check(expectedResult.equals(database.find(titleCriteria)), "Test find by title criteria");

    }

    private void testFindCriteriaAuthor() {
        BookDatabase database = new BookDatabaseImpl();
        SearchCriteria authorCriteria = new AuthorSearchCriteria("Author1");
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author1", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expectedResult = new ArrayList<>(Arrays.asList(book1, book3));
        check(expectedResult.equals(database.find(authorCriteria)), "Test find by author criteria");
    }

    private void testFindUniqueAuthorsDifferent() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author1", "Title2");
        Book book3 = new Book("Author3", "Title3");
        Book book4 = new Book("Author4", "Title4");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        Set<String> expectedResult = new HashSet<>(Arrays.asList("Author1", "Author3", "Author4"));
        check(expectedResult.equals(database.findUniqueAuthors()), "Test find unique authors");
    }

    private void testFindUniqueAuthorsSame() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Author", "Title1");
        Book book2 = new Book("Author", "Title2");
        Book book3 = new Book("Author", "Title3");
        Book book4 = new Book("Author", "Title4");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        Set<String> expectedResult = new HashSet<>(List.of("Author"));
        check(expectedResult.equals(database.findUniqueAuthors()), "Test find unique authors");
    }

    private void testFindUniqueTitleDifferent() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author1", "Title1");
        Book book3 = new Book("Author3", "Title3");
        Book book4 = new Book("Author4", "Title4");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        Set<String> expectedResult = new HashSet<>(Arrays.asList("Title1", "Title3", "Title4"));
        check(expectedResult.equals(database.findUniqueTitles()), "Test find unique title");
    }

    private void testFindUniqueTitleSame() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title");
        Book book2 = new Book("Author1", "Title");
        Book book3 = new Book("Author3", "Title");
        Book book4 = new Book("Author4", "Title");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        Set<String> expectedResult = new HashSet<>(List.of("Title"));
        check(expectedResult.equals(database.findUniqueTitles()), "Test find unique title");
    }

    private void testFindUniqueBooksEmpty() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Set<Book> expectedResult = new HashSet<>();
        check(expectedResult.equals(database.findUniqueBooks()), "Test find unique books in empty database");
    }

    private void testFindUniqueBooks() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Author", "Title");
        Book book2 = new Book("Author", "TitleTwo");
        database.save(book1);
        database.save(book2);
        database.save(book1);
        database.save(book2);
        Set<Book> expected = new HashSet<>(Arrays.asList(book1, book2));
        check(expected.equals(database.findUniqueBooks()), "Test find unique books");
    }

    private void testNotContains() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book2);
        check(!database.contains(book3), "Test that book not contains");
    }

    private void testContains() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");
        Book book3 = new Book("Author3", "Title3");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        check(database.contains(book1), "Test check that book contains");
    }
    private void testGetEachAuthorBookCount() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author1", "Title2");
        Book book3 = new Book("Author1", "Title3");
        Book book4 = new Book("Author2", "Title4");
        Book book5 = new Book("Author3", "Title5");
        Book book6 = new Book("Author3", "Title6");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        database.save(book6);
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Author1", 3);
        expectedResult.put("Author2", 1);
        expectedResult.put("Author3", 2);
        check(expectedResult.equals(database.getEachAuthorBookCount()),"Test each author book count");
    }

    private void testGetAuthorToBooksMap() {
        BookDatabase database = new BookDatabaseImpl();
        Book book1 = new Book("Author", "Title1");
        Book book2 = new Book("Author", "Title2");
        Book book3 = new Book("Author", "Title3");
        Book book4 = new Book("AuthorTwo", "Title4");
        Book book5 = new Book("AuthorTwo", "Title5");
        Book book6 = new Book("AuthorTwo", "Title6");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        database.save(book6);
        Map<String, List<Book>> expectedResult = new HashMap<>();
        List<Book> firstAuthorBooks = new ArrayList<>(Arrays.asList(book1, book2, book3));
        List<Book> secondAuthorBooks = new ArrayList<>(Arrays.asList(book4, book5, book6));
        expectedResult.put("Author", firstAuthorBooks);
        expectedResult.put("AuthorTwo", secondAuthorBooks);
        check(expectedResult.equals(database.getAuthorToBooksMap()),"Test creating authors book list");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
