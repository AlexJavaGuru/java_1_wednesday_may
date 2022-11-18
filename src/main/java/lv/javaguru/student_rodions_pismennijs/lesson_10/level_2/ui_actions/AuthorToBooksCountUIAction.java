package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.Map;

public class AuthorToBooksCountUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public AuthorToBooksCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, Integer> eachAuthorBookCount = bookDatabase.getEachAuthorBookCount();
        System.out.println(eachAuthorBookCount);
    }
}
