package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_6_middle;

import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.Book;
import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.BookDatabase;

import java.util.List;

class GetBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        List<Book> books = bookDatabase.getBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
