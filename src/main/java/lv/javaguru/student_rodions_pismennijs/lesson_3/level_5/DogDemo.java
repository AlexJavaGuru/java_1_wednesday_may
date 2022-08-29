package lv.javaguru.student_rodions_pismennijs.lesson_3.level_5;

class DogDemo {

    public static void main(String[] args) {

        Dog zhora = new Dog("Zhora", 4, "Brown");

        zhora.voice();
        zhora.happyBirthday();
        zhora.voice();
        zhora.changeColor("White");
        zhora.voice();
        zhora.happyBirthday();
        zhora.changeColor("Pink");
        zhora.voice();
    }

}
