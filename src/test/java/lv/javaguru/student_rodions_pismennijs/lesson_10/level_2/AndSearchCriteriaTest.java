package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.AndSearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.AuthorSearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.SearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.TitleSearchCriteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndSearchCriteriaTest {

    SearchCriteria subject;

    @BeforeEach
    void setUp() {
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        subject = new AndSearchCriteria(titleSearchCriteria, authorSearchCriteria);
    }

    @Test
    void match() {
        Book book1 = new Book("Zveroboi","Kuper", "2009");
        Book book2 = new Book("Zveroboi","some author", "2009");
        assertTrue(subject.match(book1));
        assertFalse(subject.match(book2));
    }
}
