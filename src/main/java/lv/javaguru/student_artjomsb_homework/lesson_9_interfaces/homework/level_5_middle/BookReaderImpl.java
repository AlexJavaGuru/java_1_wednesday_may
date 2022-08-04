package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {
    ArrayList<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            return true;
        }
        return false;
    }
}
