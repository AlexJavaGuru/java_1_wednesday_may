package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_5;

class DogThreeDemo {

    public static void main(String[] args) {
        DogThree barsik = new DogThree("Barsik", 4);
        DogThree fedor = new DogThree("Fedor", 17);

        barsik.voice();
        fedor.voice();
        fedor.happyBirthday();
        barsik.happyBirthday();
    }
}
