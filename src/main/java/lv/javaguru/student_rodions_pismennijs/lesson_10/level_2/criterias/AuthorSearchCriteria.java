package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private final String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }
}
