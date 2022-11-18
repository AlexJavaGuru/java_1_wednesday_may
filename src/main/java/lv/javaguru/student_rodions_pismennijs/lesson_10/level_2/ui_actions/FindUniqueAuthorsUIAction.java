package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.Set;

public class FindUniqueAuthorsUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> uniqueAuthors = bookDatabase.findUniqueAuthors();
        System.out.println(uniqueAuthors);
    }
}
