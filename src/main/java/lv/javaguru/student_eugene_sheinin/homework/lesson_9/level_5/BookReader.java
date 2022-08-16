package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_5;

import java.util.List;

interface BookReader {
    boolean addBook(Book book);
    boolean removeBook(Book book);

    List<Book> findBooksByAuthor(String author);

    List getBooks();
}
