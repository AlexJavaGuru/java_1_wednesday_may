package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_13;

abstract class Car {

    protected String model;
    protected int releaseYear;
    protected int topSpeed;

    protected int currentSpeed;

    protected boolean isTheCarTuned;

    public Car(String model, int releaseYear, int topSpeed, int currentSpeed) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.topSpeed = topSpeed;
        this.currentSpeed = currentSpeed;
    }

    abstract void increaseSpeed();

    abstract void slowDown();

    abstract void isCarHaveTuning(boolean isTheCarTuned);
}
