package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.search_criteria;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;

class SearchCriteriaTest {
    public static void main(String[] args) {
        SearchCriteriaTest tester = new SearchCriteriaTest();
        tester.testAuthorCriteria1();
        tester.testAuthorCriteria2();
        tester.testTitleCriteria1();
        tester.testTitleCriteria2();
        tester.testYearCriteria1();
        tester.testYearCriteria2();
        tester.testAndCriteria1();
        tester.testAndCriteria2();
        tester.testOrCriteria1();
        tester.testOrCriteria2();
    }

    private void testOrCriteria2() {
        SearchCriteria searchCriteria = new OrSearchCriteria(
                new AuthorSearchCriteria("Author"),
                new TitleSearchCriteria("Title")
        );
        Book book = new Book("notAuthor", "NotTitle");
        check(!searchCriteria.match(book), "Test check OR criteria 2");
    }

    private void testOrCriteria1() {
        SearchCriteria searchCriteria = new OrSearchCriteria(
                new AuthorSearchCriteria("Author"),
                new TitleSearchCriteria("Title")
        );
        Book book = new Book("NotAuthor", "Title");
        check(searchCriteria.match(book), "Test check OR criteria");
    }

    private void testAndCriteria2() {
        SearchCriteria searchCriteria = new AndSearchCriteria(
                new AuthorSearchCriteria("Author"),
                new TitleSearchCriteria("NotTitle"));
        Book book = new Book("Author", "Title");
        check(!searchCriteria.match(book), "Test check AND criteria 2");
    }

    private void testAndCriteria1() {
        SearchCriteria searchCriteria = new AndSearchCriteria(
                new AuthorSearchCriteria("Author"),
                new TitleSearchCriteria("Title"));
        Book book = new Book("Author", "Title");
        check(searchCriteria.match(book), "Test check AND criteria");
    }

    private void testYearCriteria2() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("-1999");
        Book book = new Book("Author", "Title", "1999");
        check(!searchCriteria.match(book), "Test year criteria 2");
    }

    private void testYearCriteria1() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("123");
        Book book = new Book("Author", "Title", "123");
        check(searchCriteria.match(book), "Test year criteria");
    }

    private void testTitleCriteria2() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("NotTitle");
        Book book = new Book("Author", "Title");
        check(!searchCriteria.match(book), "Test title criteria 2");
    }

    private void testTitleCriteria1() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("Title");
        Book book = new Book("RandomAuthor", "Title");
        check(searchCriteria.match(book), "Test title criteria");
    }

    private void testAuthorCriteria2() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Author");
        Book book = new Book("NotAuthor", "RandomTitle");
        check(!searchCriteria.match(book), "Test check OR criteria 2");
    }

    private void testAuthorCriteria1() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Author");
        Book book = new Book("Author", "RanDomTitle");
        check(searchCriteria.match(book), "Test Author criteria");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}