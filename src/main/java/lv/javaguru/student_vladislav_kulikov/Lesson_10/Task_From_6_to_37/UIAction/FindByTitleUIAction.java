package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.Book;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        String title = scanner.toString();
        List<Book> book = bookDatabase.findByTitle(title);
        System.out.println(book);
    }
}
