package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

class Book {
    private String author;
    private String bookName;
    private int year;
    private boolean isInLibrary;
    private boolean isReserved;

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public User getNameOfUser() {
        return nameOfUser;
    }

    private User nameOfUser;

    //когда книга добавляется, то она автоматом знает что она в библиотеке и она ещё не зарезервирована и также у неё нету пользователя
    public Book(String author, String bookName, int year) {
        this.author = author;
        this.bookName = bookName;
        this.year = year;
        this.isInLibrary = true;
        this.isReserved = false;
        this.nameOfUser = null;
    }
}
