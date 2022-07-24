package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_4.task_14;

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}