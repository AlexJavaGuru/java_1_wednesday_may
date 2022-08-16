package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.search_criteria;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria andSearchCriteriaOne = new AndSearchCriteria(authorCriteria, titleCriteria);
        SearchCriteria andSearchCriteriaTwo = new AndSearchCriteria(authorCriteria, yearCriteria);
        SearchCriteria orSearchCriteriaFirst = new OrSearchCriteria(titleCriteria, yearCriteria);
        SearchCriteria orSearchCriteriaFinal = new OrSearchCriteria(orSearchCriteriaFirst, authorCriteria);
    }
}
