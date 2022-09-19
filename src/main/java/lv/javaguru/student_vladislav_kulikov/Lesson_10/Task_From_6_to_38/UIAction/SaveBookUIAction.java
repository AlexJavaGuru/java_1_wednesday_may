package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Book;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.BookDatabase;

import java.util.List;
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
        List<Book> result = bookDatabase.findByAuthor(author);
        if(result.isEmpty()) {
            System.out.println("Book has not been saved");
        }
        System.out.println("Book has been saved");
        System.out.println(" ");
    }

}
