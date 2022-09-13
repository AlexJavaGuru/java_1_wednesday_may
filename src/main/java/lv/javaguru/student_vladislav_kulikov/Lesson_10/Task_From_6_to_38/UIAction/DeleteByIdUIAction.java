package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Id: ");
        Long id = scanner.nextLong();
        boolean book = bookDatabase.delete(id);
        if(!book){
            System.out.println("Error the book has not been deleted");
            System.out.println(" ");
        } else {
            System.out.println("Book has been deleted");
            System.out.println(" ");
        }

    }
}
