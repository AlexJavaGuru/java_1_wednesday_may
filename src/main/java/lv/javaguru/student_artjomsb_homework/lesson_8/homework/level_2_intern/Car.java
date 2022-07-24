package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_2_intern;

class Car {
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