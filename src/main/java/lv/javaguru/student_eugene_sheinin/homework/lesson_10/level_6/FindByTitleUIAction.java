package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_6;

import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.Book;
import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.BookDatabase;

import java.util.Scanner;

public class FindByTitleUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Enter title");
        Scanner scanner = new Scanner(System.in);
        for (Book book : bookDatabase.findByTitle(scanner.next())) {
            System.out.println(book);
        }

    }
}
