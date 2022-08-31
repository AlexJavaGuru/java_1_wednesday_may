package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.library_management;

import java.util.Date;

abstract class Book {
    private int id;
    private String author;
    private String title;
    private Date releaseDate;

    public Book(String author, String title, Date releaseDate) {
        this.author = author;
        this.title = title;
        this.releaseDate = releaseDate;
    }
}
