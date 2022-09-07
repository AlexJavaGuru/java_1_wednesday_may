package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.AuthorSearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.OrSearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.SearchCriteria;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.TitleSearchCriteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrSearchCriteriaTest {

    SearchCriteria subject;

    @BeforeEach
    void setUp() {
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        subject = new OrSearchCriteria(titleSearchCriteria, authorSearchCriteria);
    }

    @Test
    void match() {
        Book book1 = new Book("Zveroboi", "some author", "some year");
        Book book2 = new Book("some title", "Kuper", "some year");
        assertTrue(subject.match(book1));
        assertTrue(subject.match(book2));
    }
}
