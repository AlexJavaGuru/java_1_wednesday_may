package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Tests;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Book;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.TitleSearchCriteria;

class TitleSearchCriteriaTest {

    public static void main(String[] args) {
        testMatch();

    }

    static void testMatch() {
        Book book = new Book("Example", "Volume 1", null);
        TitleSearchCriteria searchCriteria = new TitleSearchCriteria(book.getTitle());
        boolean result = searchCriteria.match(book);
        check(result, "Test Match");

    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}