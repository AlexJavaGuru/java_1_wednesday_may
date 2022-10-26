package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_5_and_6;

import java.util.Objects;

class Book {

    private String title;
    private String author;
    private boolean isRead;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getBookIsRead() {
        return isRead;
    }

    public void setBookIsRead(boolean read) {
        isRead = read;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return "Book : " + title + " [" + author + ']';
    }
}
