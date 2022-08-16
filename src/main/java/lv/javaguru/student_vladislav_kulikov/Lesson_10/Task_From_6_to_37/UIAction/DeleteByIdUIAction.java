package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.BookDatabase;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Id: ");
        Long id = scanner.nextLong();
        boolean book = bookDatabase.delete(id);
        System.out.println(book);
    }
}
