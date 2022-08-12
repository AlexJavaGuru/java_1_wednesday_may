package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

import java.util.ArrayList;
import java.util.List;


class BookDatabaseImpl implements BookDatabase {
    private final List<Book> books = new ArrayList<>();
    private long id = 1;

    @Override
    public Long save(Book book) {
        books.add(book);
        book.setId(id);
        id += 1;
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
