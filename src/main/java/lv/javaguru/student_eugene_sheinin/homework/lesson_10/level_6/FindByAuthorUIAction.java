package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_6;

import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.Book;
import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.BookDatabase;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Enter author");
        Scanner scanner = new Scanner(System.in);
        for (Book book : bookDatabase.findByAuthor(scanner.next())) {
            System.out.println(book);
        }

    }
}
