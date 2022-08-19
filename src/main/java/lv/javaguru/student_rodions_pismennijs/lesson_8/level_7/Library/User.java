package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_7.Library;

class User {

    private String userName;
    private int countOfBooks;

    public User(String userName) {
        this.userName = userName;
        this.countOfBooks = 0;
    }

    public int getCountOfBooks() {
        return countOfBooks;
    }
}
