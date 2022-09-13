package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38;

import java.util.Objects;

public class Book {

    private Long id;
    private String title;
    private String author;

    private String yearOfIssueToSearch;

    public Book(String author, String title, String yearOfIssueToSearch) {
        this.author = author;
        this.title = title;
        this.yearOfIssueToSearch = yearOfIssueToSearch;
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

    public String getYearOfIssueToSearch() {
        return this.yearOfIssueToSearch;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}

