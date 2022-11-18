package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;

public class AndSearchCriteria implements SearchCriteria {

    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return this.leftCondition.match(book) && this.rightCondition.match(book);
    }
}
