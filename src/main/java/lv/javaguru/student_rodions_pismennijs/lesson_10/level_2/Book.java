package lv.javaguru.student_rodions_pismennijs.lesson_10.level_2;

import java.util.Objects;

public class Book {
    private Long id;
    private final String title;
    private final String author;
    private final String yearOfIssue;

    public Book(String title, String author, String yearOfIssue) {
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(yearOfIssue, book.yearOfIssue);
    }

    @Override
    public String toString() {
        return "{Book Id:" + id + ", Title:" + title + ", Author:" + author + ", Year:" + yearOfIssue + '}';
    }
}
