package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.Set;

public class FindUniqueTitlesUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> uniqueTitles = bookDatabase.findUniqueTitles();
        System.out.println(uniqueTitles);
    }
}
