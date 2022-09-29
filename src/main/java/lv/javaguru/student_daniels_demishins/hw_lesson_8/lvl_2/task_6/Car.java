package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_2.task_6;

public class Car {

    protected int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "releaseYear=" + releaseYear +
                '}';
    }
}

