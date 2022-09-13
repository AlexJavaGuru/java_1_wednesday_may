package lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_4;

import lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_4.Book;

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
