package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_13_to_25;

import java.util.List;

interface BookReader {

    boolean saveBook(Book book);

    boolean deleteBook(Book book);

    boolean nullCheck(Book book);

    Book[] seeBooksInLibrary();

    List<Book> findBookByAuthor(String author);

    List<Book> findBookByTitle(String author);

    boolean markBookAsRead(Book readBook);

    boolean markBookAsUnread(Book readBook);

    void seeAllInformation();

}
