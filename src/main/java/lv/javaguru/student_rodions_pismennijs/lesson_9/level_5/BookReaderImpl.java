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
    public String getBookByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author) || book.getAuthor().contains(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks.toString();
    }
}
