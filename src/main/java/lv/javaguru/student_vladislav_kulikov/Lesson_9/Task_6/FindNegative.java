package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_6;

@FunctionalInterface
interface FindNegative {

    boolean findNegativeNumber(int number);
    //Так называется специальная разновидность интерфейса, который определяет тип-функцию, коллбэк.
    //Чтобы компилятор считал интерфейс функциональным, этот интерфейс должен добавлять единственный абстрактный метод.
}
