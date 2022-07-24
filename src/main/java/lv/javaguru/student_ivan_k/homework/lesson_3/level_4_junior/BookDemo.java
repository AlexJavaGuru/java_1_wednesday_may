package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_4_junior;

import main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_4_junior.Book;

 class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);

    }
}
