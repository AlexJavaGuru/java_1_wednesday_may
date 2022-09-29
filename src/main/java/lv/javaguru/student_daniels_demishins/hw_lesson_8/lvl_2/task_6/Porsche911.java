package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_2.task_6;

public class Porsche911 extends Car {

    protected int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Porsche911{" +
                "releaseYear=" + releaseYear +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
