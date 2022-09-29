package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_6;

import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.Book;
import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Enter id");
        Scanner scanner = new Scanner(System.in);
        bookDatabase.delete(scanner.nextLong());
    }
}
