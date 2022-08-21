package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_31;

class User {

    private String name;

    private int countOfBooks;

    private int debt;

    User(String name) {
        this.name = name;
        this.debt = 0;
        this.countOfBooks = 0;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getDebt() {
        return debt;
    }

    void setDebt(int debt) {
        this.debt = debt;
    }

    int getCountOfBooks() {
        return countOfBooks;
    }

    void setCountOfBooks(int countOfBooks) {
        this.countOfBooks = countOfBooks;
    }
}
