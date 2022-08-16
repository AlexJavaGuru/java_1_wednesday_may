package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.search_criteria;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(titleToSearch);
    }

}
