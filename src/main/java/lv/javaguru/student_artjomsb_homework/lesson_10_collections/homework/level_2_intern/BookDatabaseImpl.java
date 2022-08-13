package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class BookDatabaseImpl implements BookDatabase {
    private final List<Book> books = new ArrayList<>();
    private long id = 1L;

    @Override
    public Long save(Book book) {
        books.add(book);
        book.setId(id);
        id++;
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

    @Override
    public boolean delete(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }
}
