package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Book;

public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }
}
