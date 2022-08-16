package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.UIAction;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.Book;
import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book id: ");
        Long id = scanner.nextLong();
        Optional<Book> book = bookDatabase.findById(id);
        System.out.println(book);
    }

}
