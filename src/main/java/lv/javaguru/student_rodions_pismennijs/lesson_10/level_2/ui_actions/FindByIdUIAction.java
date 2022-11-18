package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type book ID: ");
        Long id = scanner.nextLong();
        Optional<Book> byId = bookDatabase.findById(id);
        System.out.println(byId);
    }
}
