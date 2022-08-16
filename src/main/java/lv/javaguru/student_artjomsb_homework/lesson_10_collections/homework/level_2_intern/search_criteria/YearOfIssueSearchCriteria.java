package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.search_criteria;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }

}
