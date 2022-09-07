package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteBooksByTitleUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteBooksByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type book title: ");
        String title = scanner.next();
        bookDatabase.deleteByTitle(title);
    }
}
