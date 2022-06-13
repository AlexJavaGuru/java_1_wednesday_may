package main.java.lv.javaguru.student_rodions_pismennijs.lesson_3.level_5;

class DogDemo {

    public static void main(String[] args) {

        Dog zhora = new Dog("Zhora", 4, "Brown");

        zhora.voice();
        zhora.age = (zhora.age + 1);
        zhora.happyBirthday();
        zhora.voice();
        zhora.changeColor("White");
        zhora.voice();

    }

}
