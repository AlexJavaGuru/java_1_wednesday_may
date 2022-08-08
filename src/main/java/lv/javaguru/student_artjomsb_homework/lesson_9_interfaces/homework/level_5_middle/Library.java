package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

import java.util.ArrayList;

interface Library {
    boolean addBook(Book book);

    boolean deleteBook(Book book);

    ArrayList<Book> getBookList();

    ArrayList<Book> findBooksByAuthor(String author);

    ArrayList<Book> findBooksByName(String title);

    boolean markBookAsRead(Book book);

    boolean markBookAsNotRead(Book book);

    ArrayList<Book> getReadBookList();

    ArrayList<Book> getNotReadBookList();
}
