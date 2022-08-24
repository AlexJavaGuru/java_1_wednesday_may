package lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_5;

import lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_5.Dog;

class DogDemo {

    public static void main(String[] args) {

        Dog beethoven = new Dog("Beethoven", 3, "brown");

        beethoven.voice();
        beethoven.age = (beethoven.age + 1);
        beethoven.happyBirthday();
        beethoven.voice();
        beethoven.changeColor("black");
        beethoven.voice();

    }

}
