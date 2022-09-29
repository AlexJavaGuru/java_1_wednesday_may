package lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

import lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5.Book;
import java.util.*;
import java.util.stream.Collectors;

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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> foundedBooks = new ArrayList<>();

        for (Book book : books) {
            if(searchCriteria.match(book)) {
                foundedBooks.add(book);
            }
        }

        return foundedBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> booksSet = new HashSet();

        for (Book book : books) {
            booksSet.add(book.getAuthor());
        }

        return booksSet;
    }

    public Set<String> findUniqueTitles() {
        Set<String> booksSet = new HashSet();

        for (Book book : books) {
            booksSet.add(book.getTitle());
        }

        return booksSet;
    }

    public Set<Book> findUniqueBooks() {
        Map<String, Set<String>> uniqueBooksMap = new HashMap<>();
        for (Book book : books) {
            Set booksTitleSet = (uniqueBooksMap.get(book.getAuthor()) !=  null) ?
                    uniqueBooksMap.get(book.getAuthor()) : new HashSet<>();
            booksTitleSet.add(book.getTitle());
            uniqueBooksMap.put(book.getAuthor(), booksTitleSet);
        }

        Set<Book> uniqueBooksSet = new HashSet<>();
        for (String author : uniqueBooksMap.keySet()) {
            for (String title : uniqueBooksMap.get(author)) {
                uniqueBooksSet.add(new Book(author, title));
            }
        }

        return uniqueBooksSet;
    }

    @Override
    public boolean contains(Book book) {

        return new HashSet(books).contains(book);
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Set<String>> uniqueBooksMap = new HashMap<>();
        for (Book book : books) {
            Set booksTitleSet = (uniqueBooksMap.get(book.getAuthor()) !=  null) ?
                    uniqueBooksMap.get(book.getAuthor()) : new HashSet<>();
            booksTitleSet.add(book.getTitle());
            uniqueBooksMap.put(book.getAuthor(), booksTitleSet);
        }


        Map<String, Integer> uniqueBooksMapCount = new HashMap<>();
        for (String author : uniqueBooksMap.keySet()) {
            for (String title : uniqueBooksMap.get(author)) {
                uniqueBooksMapCount.put(author, uniqueBooksMap.get(author).size());
            }
        }

        return uniqueBooksMapCount;
    }

    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> booksMap = new HashMap<>();
        for (Book book : books) {
            List<Book> bookList = (booksMap.get(book.getAuthor()) !=  null) ?
                    booksMap.get(book.getAuthor()) : new ArrayList<>();
            bookList.add(book);
            booksMap.put(book.getAuthor(), bookList);
        }

        return booksMap;
    }

    public Map<String, List<Book>> getAuthorToBooksMapV2() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }

}
