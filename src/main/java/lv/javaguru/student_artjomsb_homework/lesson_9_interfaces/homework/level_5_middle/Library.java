package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

import java.util.List;

interface Library {
    boolean addBook(Book book);

    boolean deleteBook(Book book);

    List<Book> getBookList();

    List<Book> findBooksByAuthor(String author);

    List<Book> findBooksByName(String title);

    boolean markBookAsRead(Book... book);

    boolean markBookAsNotRead(Book... book); //только под конец вспомнил когда тесты делал про varargs, по сути можно переделать половину с varargs

    List<Book> getReadBookList();

    List<Book> getNotReadBookList();
}
