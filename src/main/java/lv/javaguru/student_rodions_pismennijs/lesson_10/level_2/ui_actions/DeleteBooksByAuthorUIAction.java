package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteBooksByAuthorUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteBooksByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type book author: ");
        String author = scanner.next();
        bookDatabase.deleteByAuthor(author);
    }
}
