package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.SearchCriteria;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.Book;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }

}
