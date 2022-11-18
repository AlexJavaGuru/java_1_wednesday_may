package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type book title: ");
        String title = scanner.next();
        List<Book> byTitle = bookDatabase.findByTitle(title);
        System.out.println(byTitle);
    }
}
