package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase{
    List<Long> indexes = new ArrayList<>();
    List<Book> books = new ArrayList<>();
    @Override
    public Long save(Book book) {
        Long newId = (this.indexes.isEmpty()) ? 1 : indexes.get(indexes.size() - 1) + 1;
        indexes.add(newId);
        book.setId(newId);
        books.add(book);
        return newId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if(book.getId().equals(bookId)) {
                return books.remove(book);
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return books.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if(book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> foundedBooks = new ArrayList<>();

        for (Book book : books) {
            if(book.getAuthor().equals(author)) {
                foundedBooks.add(book);
            }
        }

        return foundedBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundedBooks = new ArrayList<>();

        for (Book book : books) {
            if(book.getTitle().contains(title)) {
                foundedBooks.add(book);
            }
        }

        return foundedBooks;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    public void deleteByAuthor(String author) {
        List<Book> copyBooks = new ArrayList<>(books);

        for (Book book : copyBooks) {
            if(book.getAuthor().equals(author)) {
                books.remove(book);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> copyBooks = new ArrayList<>(books);

        for (Book book : copyBooks) {
            if(book.getTitle().contains(title)) {
                books.remove(book);
            }
        }
    }
}
