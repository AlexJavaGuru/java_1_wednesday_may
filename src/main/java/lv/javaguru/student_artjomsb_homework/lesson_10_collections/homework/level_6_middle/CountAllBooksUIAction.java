package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.BookDatabase;

class CountAllBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println(bookDatabase.countAllBooks());
    }
}
