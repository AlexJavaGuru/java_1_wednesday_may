package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_13_to_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ДЛЯ УЧИТЕЛЯ!!!!
//Код был дописан после 10 lesson поэтому тут код слегка смешан (коллекции и массивы)
class BookReaderImpl implements BookReader {

    Book[] books;
    List<Book> readBooks = new ArrayList<>();
    List<Book> unRead = new ArrayList<>();

    BookReaderImpl(Book[] books) {
        this.books = books;
    }


    @Override
    public boolean saveBook(Book book) {
        Book[] booksCopy = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            booksCopy[i] = books[i];
        }

        books = booksCopy;

        if (nullCheck(book)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                }
                if (checkBook()) {
                    cleanNull();
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (nullCheck(book)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].equals(book)) {
                    books[i] = null;
                    cleanNull();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        List<Book> bookCopy = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                bookCopy.add(book);
            }
        }
        return bookCopy;
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        List<Book> bookCopy = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                bookCopy.add(book);
            }
        }
        return bookCopy;
    }


    @Override
    public boolean markBookAsRead(Book readBook) {
        for (Book book : books) {
            if (book.equals(readBook)) {
                readBooks.add(readBook);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markBookAsUnread(Book unReadBook) {
        for (Book book : books) {
            if (book.equals(unReadBook)) {
                unRead.add(unReadBook);
                return true;
            }
        }
        return false;
    }

    @Override
    public void seeAllInformation() {
        System.out.println(Arrays.toString(books));
        theBooksThatAreRead();
        theBooksThatAreUnread();
    }

    void theBooksThatAreRead() {
        System.out.println("Books you have read: " + readBooks);
    }

    void theBooksThatAreUnread() {

        System.out.println("Books you haven't read: " + unRead);
    }

    @Override
    public Book[] seeBooksInLibrary() {
        return books;
    }


    @Override
    public boolean nullCheck(Book book) {
        return book != null && book.getTitle() != null && book.getAuthor() != null;
    }

    private boolean checkBook() {
        for (int i = 0; i < books.length; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i] != null && books[j] != null && books[i].equals(books[j])) {
                    books[j] = null;
                    return true;
                }
            }
        }
        return false;
    }

    private void cleanNull() {
        int count = 0;

        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }

        Book[] bookCopy = new Book[count];
        int i = 0;

        for (Book book : books) {
            if (book != null) {
                bookCopy[i] = book;
                i++;
            }
        }
        books = bookCopy;
    }
}