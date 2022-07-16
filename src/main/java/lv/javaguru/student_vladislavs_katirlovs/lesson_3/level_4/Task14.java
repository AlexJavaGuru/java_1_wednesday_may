package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_4;

class Book {

    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
