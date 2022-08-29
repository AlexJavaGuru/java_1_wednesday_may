package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.search_criteria;

import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;

public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }

}
