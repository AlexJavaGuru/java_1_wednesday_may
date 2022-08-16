package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.SearchCriteria;


import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
