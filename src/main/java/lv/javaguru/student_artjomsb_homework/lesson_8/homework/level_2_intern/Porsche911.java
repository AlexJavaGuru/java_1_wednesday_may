package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_2_intern;

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Porsche911{" +
                "topSpeed=" + topSpeed +
                ", releaseYear=" + releaseYear +
                '}';
    }

}