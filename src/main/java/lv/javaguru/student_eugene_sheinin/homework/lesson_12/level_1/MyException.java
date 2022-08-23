package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_1;

//task 1, 2, 3

//RuntimeException extends from Exception, and Exception extends from Throwable - this is answer on question in task 7 too
class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}