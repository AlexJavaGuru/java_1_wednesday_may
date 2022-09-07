package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;

public class OrSearchCriteria implements SearchCriteria {

    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return this.leftCondition.match(book) || this.rightCondition.match(book);
    }
}
