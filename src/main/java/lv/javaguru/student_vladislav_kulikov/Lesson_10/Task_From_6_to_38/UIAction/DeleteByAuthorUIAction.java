package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Book;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Author: ");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);
        List<Book> result = bookDatabase.findByAuthor(author);
        if(result == null) {
            System.out.println("Book has been deleted");
            System.out.println(" ");
        } else {
            System.out.println("The book has not been deleted");
            System.out.println(" ");
        }
    }
}
