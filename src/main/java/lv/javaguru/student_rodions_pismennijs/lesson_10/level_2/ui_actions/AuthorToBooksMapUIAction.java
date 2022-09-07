package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.List;
import java.util.Map;

public class AuthorToBooksMapUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public AuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, List<Book>> authorToBooksMap = bookDatabase.getAuthorToBooksMap();
        System.out.println(authorToBooksMap);
    }
}
