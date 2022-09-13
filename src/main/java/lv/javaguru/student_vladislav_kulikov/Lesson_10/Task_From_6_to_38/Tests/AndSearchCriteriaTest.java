package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Tests;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.AndSearchCriteria;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.AuthorSearchCriteria;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Book;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.TitleSearchCriteria;

class AndSearchCriteriaTest {
    public static void main(String[] args) {
        testMatch();
    }

    static void testMatch() {
        Book book = new Book("Example", "Volume 1", "2000");
        AndSearchCriteria searchCriteria = new AndSearchCriteria(new AuthorSearchCriteria(book.getAuthor()),
                new TitleSearchCriteria(book.getTitle()));
        boolean result = searchCriteria.match(book);
        check(result, "Test Match");
    }

    private static void check(boolean result, String taskName) {
        if(result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
