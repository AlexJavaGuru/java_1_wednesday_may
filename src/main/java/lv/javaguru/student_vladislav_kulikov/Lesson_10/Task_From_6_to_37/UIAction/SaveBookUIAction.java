package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.Book;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Author: ");
        String author = scanner.nextLine();
        System.out.println("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Book Year: ");
        String year = scanner.nextLine();

        Book book = new Book(author, title, year);
        bookDatabase.save(book);
    }

}
