package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;

public interface SearchCriteria {

    boolean match(Book book);
}
