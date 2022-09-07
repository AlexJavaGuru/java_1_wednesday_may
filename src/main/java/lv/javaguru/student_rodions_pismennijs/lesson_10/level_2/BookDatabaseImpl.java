package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2;

import lv.javaguru.student_rodions_pismennijs.lesson_10.level_2.criterias.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    private final List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            id++;
            book.setId(id);
        }
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
        for (Book book1 : books) {
            if (book1.equals(book)) {
                books.remove(book1);
                return true;
            }
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
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> titleBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                titleBooks.add(book);
            }
        }
        return titleBooks;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksToFind = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                booksToFind.add(book);
            }
        }
        return booksToFind;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : books) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : books) {
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map <String, List<Book>> authorBooks = new HashMap<>();
        for (Book book : books) {
            authorBooks.put(book.getAuthor(), findByAuthor(book.getAuthor()));
        }
        return authorBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBooksCount = new HashMap<>();
        for (Book book : books) {
            authorBooksCount.put(book.getAuthor(), findByAuthor(book.getAuthor()).size());
        }
        return authorBooksCount;
    }
}
