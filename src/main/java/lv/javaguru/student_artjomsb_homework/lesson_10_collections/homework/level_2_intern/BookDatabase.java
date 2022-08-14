package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

import java.util.List;
import java.util.Optional;

interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> getBooks();
}
