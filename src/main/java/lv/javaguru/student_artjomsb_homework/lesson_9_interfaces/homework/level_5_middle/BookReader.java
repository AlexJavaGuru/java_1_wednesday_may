package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

import java.util.ArrayList;
import java.util.List;

class BookReader implements Library {
    List<Book> books = new ArrayList<>();
    List<Book> booksRead = new ArrayList<>();
    List<Book> booksNotRead = new ArrayList<>();

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
    public List<Book> getBookList() {
        return books;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        ArrayList<Book> thisAuthorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().startsWith(author)) {
                thisAuthorBooks.add(book);
            }
        }
        return thisAuthorBooks;
    }

    @Override
    public List<Book> findBooksByName(String title) {
        ArrayList<Book> thisTitleBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getNameOfBook().startsWith(title)) {
                thisTitleBooks.add(book);
            }
        }
        return thisTitleBooks;
    }

    @Override
    public boolean markBookAsRead(Book... books) {
        boolean isAdded = false;
        for (Book book : books) {
            if (this.books.contains(book) && !booksRead.contains(book)) {
                booksRead.add(book);
                isAdded = true;
            } else {
                isAdded = false;
            }

            if (!isAdded) {
                System.out.println("Error in book adding");
                break;
            }
        }
        return isAdded;
    }

    @Override
    public boolean markBookAsNotRead(Book... books) {
        boolean isAdded = false;
        for (Book book : books) {
            if (this.books.contains(book) && !booksNotRead.contains(book)) {
                booksNotRead.add(book);
                isAdded = true;
            } else {
                isAdded = false;
            }
            //тут ситуация такая, после добавления varArgs я столкнулся спроблеммой, что после добавления первой книги он возращает true и заканчвает цикл(следущие книги не добавляются).
            //пока что с флагами, что если книга добавлена,то мы продолжаем добавлять, до того момента пока не будет ошибка добавления.
            //сам понимаю что такое сложно для чтения и понимания, но если использовать varArgs то надо делать новые методы чтобы было красиво.
            if (!isAdded) {
                System.out.println("Error in book adding");
                break;
            }
        }
        return isAdded;
    }

    @Override
    public List<Book> getReadBookList() {
        return booksRead;
    }

    @Override
    public List<Book> getNotReadBookList() {
        return booksNotRead;
    }

    boolean isHaveAuthorAndName(Book book) {
        return book.getNameOfBook() != null && book.getAuthor() != null;
    }
}
