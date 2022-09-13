package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please input book ID - ");
        long id = userInput.nextLong();
        if (bookDatabase.delete(id)) {
            System.out.println("Book successfully deleted");
        } else {
            System.out.println("Error, book with this ID not found");
        }

    }
}
