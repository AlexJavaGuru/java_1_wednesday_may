package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

import java.util.ArrayList;

class BookRepository implements Library {
    ArrayList<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (!books.contains(book) && isHaveAuthorAndName(book)) {
            books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Book> getBookList() {
        return books;
    }

    @Override
    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> thisAuthorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().startsWith(author)) {
                thisAuthorBooks.add(book);
            }
        }
        return thisAuthorBooks;
    }

    boolean isHaveAuthorAndName(Book book) {
        return book.getNameOfBook() != null && book.getAuthor() != null;
    }
}
