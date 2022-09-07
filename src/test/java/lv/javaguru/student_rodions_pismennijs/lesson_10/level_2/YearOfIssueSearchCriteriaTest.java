package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.SearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.YearOfIssueSearchCriteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfIssueSearchCriteriaTest {

    SearchCriteria subject;

    @BeforeEach
    void setUp() {
        subject = new YearOfIssueSearchCriteria("2020");
    }

    @Test
    void match() {
        Book book1 = new Book("title","author", "2020");
        Book book2 = new Book("title","author", "2007");
        assertTrue(subject.match(book1));
        assertFalse(subject.match(book2));
    }
}
