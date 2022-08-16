package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.SearchCriteria;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.Book;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssueToSearch().equals(yearOfIssueToSearch);
    }
}

