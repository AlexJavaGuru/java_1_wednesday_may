package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Book;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        String title = scanner.nextLine();
        List<Book> book = bookDatabase.findByTitle(title);
        if(book == null) {
            System.out.println("Book not found");
            System.out.println(" ");
        } else {
            System.out.println(book);
            System.out.println(" ");
        }
    }
}
