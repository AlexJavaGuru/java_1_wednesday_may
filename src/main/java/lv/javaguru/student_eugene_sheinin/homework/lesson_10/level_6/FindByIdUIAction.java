package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_6;

import main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.Book;
import main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Enter Id");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt.get());
    }

}
