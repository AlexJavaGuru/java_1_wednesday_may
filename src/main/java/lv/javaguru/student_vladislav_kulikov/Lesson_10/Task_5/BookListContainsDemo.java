package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book bookOne = new Book("Example", "Example");
        Book bookTwo = new Book("Example1", "Example1");

        bookList.add(bookOne);
        bookList.add(bookTwo);

        if(bookList.contains(new Book("Example", "Example"))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
