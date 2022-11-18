package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

public class CountAllBooksUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        int counter = bookDatabase.countAllBooks();
        System.out.println("Books is library: " + counter);
    }
}
