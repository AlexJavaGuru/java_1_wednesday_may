package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_5_middle;

class Book {
    private String author;

    private String nameOfBook;

    public Book(String author, String nameOfBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    public Book() {

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return nameOfBook + " [ " + author + " ] ";
    }
}
