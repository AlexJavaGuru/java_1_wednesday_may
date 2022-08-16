package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.SearchCriteria.SearchCriteria;

import java.util.*;

public class BookDataBaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();

    @Override///////Need to fix
    public Long save(Book book) {
        books.add(book);
        book.setId(books.indexOf(book) + 1L);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
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
            if (book.getId() == bookId) {
                Optional<Book> optionalBook = Optional.of(book);
                return optionalBook;
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                bookList.add(book);
                return bookList;
            }
        }
        return null;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                bookList.add(book);
                return bookList;
            }
        }
        return null;
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
        List<Book> resultList = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                resultList.add(book);
            }
        }
        return resultList;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> resultUniqueBooks = new HashSet<>(books);
        return resultUniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }


    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> listMap = new HashMap<>();
        for (Book book : books) {
            List<Book> bookList = new ArrayList<>();
            for (Book book1 : books) {
                if (book.getAuthor().equals(book1.getAuthor())) {
                    bookList.add(book1);
                }
            }
            listMap.put(book.getAuthor(), bookList);
        }
        return listMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> listMap = new HashMap<>();
        for (Book book : books) {
            int count = 0;
            for (Book book1 : books) {
                if (book.getAuthor().equals(book1.getAuthor())) {
                    count++;
                }
            }
            listMap.put(book.getAuthor(), count);
        }
        return listMap;
    }

}
