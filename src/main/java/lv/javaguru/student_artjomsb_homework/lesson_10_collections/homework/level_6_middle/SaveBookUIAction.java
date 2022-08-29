package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;
import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please input Book Author - ");
        String author = userInput.nextLine();
        System.out.print("Please Input Book Title - ");
        String title = userInput.nextLine();
        System.out.print("Please Input Book Year of issue - ");
        String year = userInput.nextLine();
        Book book = new Book(author, title, year);
        bookDatabase.save(book);
    }

}