package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;
import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please input book Author - ");
        String author = userInput.nextLine();
        List<Book> books = bookDatabase.findByAuthor(author);
        System.out.println(books);
    }
}
