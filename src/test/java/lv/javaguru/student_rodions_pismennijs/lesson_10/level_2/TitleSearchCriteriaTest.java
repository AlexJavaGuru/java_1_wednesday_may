package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.SearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.TitleSearchCriteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleSearchCriteriaTest {

    SearchCriteria subject;

    @BeforeEach
    void setUp() {
        subject = new TitleSearchCriteria("one title");
    }

    @Test
    void match() {
        Book book1 = new Book("one title","author", "2000");
        Book book2 = new Book("second title","author", "2000");
        assertTrue(subject.match(book1));
        assertFalse(subject.match(book2));
    }
}
