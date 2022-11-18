package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.AuthorSearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.SearchCriteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorSearchCriteriaTest {

    SearchCriteria subject;

    @BeforeEach
    void setUp() {
        subject = new AuthorSearchCriteria("some author");
    }

    @Test
    void match() {
        Book book1 = new Book("title","some author", "2000");
        Book book2 = new Book("title","diff author", "2000");
        assertTrue(subject.match(book1));
        assertFalse(subject.match(book2));
    }
}
