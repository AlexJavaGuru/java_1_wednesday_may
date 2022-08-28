package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_6;

class Porsche911 extends Car {

    protected int topSpeed;
    Porsche911 (int releaseYear, int topSpeed ){
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
