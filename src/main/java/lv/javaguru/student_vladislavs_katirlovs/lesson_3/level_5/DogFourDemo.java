package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_5;

class DogFourDemo {

    public static void main(String[] args) {
        DogFour barsik = new DogFour("Barsik ", 4, "red ");
        DogFour fedor = new DogFour("Fedor ", 17, "yellow ");

        barsik.voice();
        fedor.voice();
        fedor.happyBirthday();
        barsik.happyBirthday();
    }
}
