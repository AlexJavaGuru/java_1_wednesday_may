package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

public class OrSearchCriteria implements SearchCriteria{

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return this.leftCondition.match(book) || this.rightCondition.match(book);
    }

}
