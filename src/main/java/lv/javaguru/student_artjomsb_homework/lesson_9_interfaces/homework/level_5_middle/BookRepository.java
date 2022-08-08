package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

import java.util.ArrayList;

class BookRepository implements Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Book> booksRead = new ArrayList<>();
    ArrayList<Book> booksNotRead = new ArrayList<>();

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

    @Override
    public ArrayList<Book> findBooksByName(String title) {
        ArrayList<Book> thisTitleBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getNameOfBook().startsWith(title)) {
                thisTitleBooks.add(book);
            }
        }
        return thisTitleBooks;
    }

    @Override
    public boolean markBookAsRead(Book book) {
        if (books.contains(book)) {
            booksRead.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean markBookAsNotRead(Book book) {
        if (books.contains(book)) {
            booksNotRead.add(book);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Book> getReadBookList() {
        return booksRead;
    }

    @Override
    public ArrayList<Book> getNotReadBookList() {
        return booksNotRead;
    }

    boolean isHaveAuthorAndName(Book book) {
        return book.getNameOfBook() != null && book.getAuthor() != null;
    }
}
