package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_5_and_6;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);
    boolean removeBook(Book book);

    List<Book> getAllBooks();

    List<Book> getBooksByAuthor(String author);

    List<Book> getBooksByTitle(String title);

    boolean markBookAsRead(Book book);

    boolean markBookAsUnread(Book book);

    List<Book> getAllReadBooks();

    List<Book> getAllUnreadBooks();
}
