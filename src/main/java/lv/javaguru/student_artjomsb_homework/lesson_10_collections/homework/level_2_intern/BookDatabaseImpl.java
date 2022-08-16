package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.search_criteria.SearchCriteria;

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
    public List<Book> findByAuthor(String author) {
        List<Book> authorBook = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorBook.add(book);
            }
        }
        return authorBook;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookTitles = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookTitles.add(book);
            }
        }
        return bookTitles;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorBooks.add(book);
            }
        }
        books.removeAll(authorBooks);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> bookTitles = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookTitles.add(book);
            }
        }
        books.removeAll(bookTitles);
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> foundedBooks = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                foundedBooks.add(book);
            }
        }
        return foundedBooks;
    }
}
