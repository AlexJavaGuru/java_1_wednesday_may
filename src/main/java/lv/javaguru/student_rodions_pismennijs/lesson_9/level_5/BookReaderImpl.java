package lv.javaguru.student_rodions_pismennijs.lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (!books.contains(book) && isBookHasTitleAndAuthor(book)) {
            books.add(book);
            return true;
        }
        return false;
    }

    private boolean isBookHasTitleAndAuthor(Book book) {
        return book.getTitle() != null && book.getAuthor() != null;
    }

    @Override
    public boolean removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public String getAllBooks() {
        return books.toString();
    }

    @Override
    public String getBooksByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author) || book.getAuthor().contains(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks.toString();
    }

    @Override
    public String getBooksByTitle(String title) {
        List<Book> titleBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title) || book.getTitle().contains(title)) {
                titleBooks.add(book);
            }
        }
        return titleBooks.toString();
    }

    @Override
    public boolean markBookAsRead(Book book) {
        if (books.contains(book)) {
            book.setBookIsRead(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean markBookAsUnread(Book book) {
        if (books.contains(book)) {
            book.setBookIsRead(false);
            return true;
        }
        return false;
    }

    @Override
    public String getAllReadBooks() {
        List<Book> readBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookIsRead()) {
                readBooks.add(book);
            }
        }
        return readBooks.toString();
    }

    @Override
    public String getAllUnreadBooks() {
        List<Book> unreadBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.getBookIsRead()) {
                unreadBooks.add(book);
            }
        }
        return unreadBooks.toString();
    }
}
