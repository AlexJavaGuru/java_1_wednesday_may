package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.ui_actions;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.Book;
import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type book title: ");
        String title = scanner.next();
        System.out.print("Type book author: ");
        String author = scanner.next();
        System.out.print("Type book year: ");
        String year = scanner.next();
        Book book = new Book(title, author, year);
        bookDatabase.save(book);
    }
}
