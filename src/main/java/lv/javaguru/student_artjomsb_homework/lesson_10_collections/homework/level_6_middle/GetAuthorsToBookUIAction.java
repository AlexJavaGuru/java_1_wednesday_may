package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;
import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.BookDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetAuthorsToBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetAuthorsToBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> authors = bookDatabase.getAuthorToBooksMap().keySet();
        Map<String, List<Book>> authorBooks = bookDatabase.getAuthorToBooksMap();
        for (String author : authors) {
            System.out.println(author + " - " + authorBooks.get(author));
        }
    }
}
