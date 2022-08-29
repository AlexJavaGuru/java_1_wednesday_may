package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern;

import lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_2_intern.search_criteria.SearchCriteria;

import java.util.*;


public class BookDatabaseImpl implements BookDatabase {
    private final List<Book> books = new ArrayList<>();
    private long id = 1L;
    private final Set<String> uniqueAuthor = new HashSet<>();
    private final Set<String> uniqueTitle = new HashSet<>();

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

    @Override
    public Set<String> findUniqueAuthors() {
        for (Book book : books) {
            uniqueAuthor.add(book.getAuthor());
        }
        return uniqueAuthor;
    }

    @Override
    public Set<String> findUniqueTitles() {
        for (Book book : books) {
            uniqueTitle.add(book.getTitle());
        }
        return uniqueTitle;
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
        Set<String> authors = findUniqueAuthors();
        Map<String, List<Book>> authorBooks = new HashMap<>();

        for (String author : authors) {
            List<Book> booksOfAuthor = new ArrayList<>();
            for (Book book : books) {
                if (book.getAuthor().equals(author)) {
                    booksOfAuthor.add(book);
                }
            }
            authorBooks.put(author, booksOfAuthor);
        }

        return authorBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBooksNumber = new HashMap<>();
        Map<String, List<Book>> authorBooks = getAuthorToBooksMap();
        Set<String> uniqueAuthors = authorBooks.keySet();
        for (String author : uniqueAuthors) {
            Set<Book> uniqueBooks = new HashSet<>(authorBooks.get(author));
            authorBooksNumber.put(author, uniqueBooks.size());
        }
        return authorBooksNumber;
    }
}
