package lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_5_6;

import java.util.List;

interface BookReader {
    boolean addBook(Book book);

    boolean markAsReadBook(Book book);

    boolean markAsUnreadBook(Book book);
    boolean removeBook(Book book);

    List<Book> getReadedBookList();
    List<Book> getNotReadedBookList();

    List<Book> findBooksByAuthor(String author);

    List<Book> findBooksByTitle(String title);

    List getBooks();
}
