package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;
import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please input book ID - ");
        long id = userInput.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt);
    }

}
