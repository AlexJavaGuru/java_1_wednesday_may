package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private String author;

    private String yearOfIssue;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book id: " + id + " author: " +  author  + " title " + title;
    }
}
