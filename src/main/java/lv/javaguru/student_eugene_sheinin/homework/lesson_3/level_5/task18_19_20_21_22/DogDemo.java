package lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_5.task18_19_20_21_22;

public class DogDemo {

    public static void main(String[] args) {

        //lesson 18
        Dog dog1 = new Dog("Spot1");
        dog1.voice();

        //lesson 19
        Dog dog2 = new Dog("Spot2", 10);
        dog2.voice();

        //lesson 20
        Dog dog3 = new Dog("Spot3", 5);
        dog3.voice();
        dog3.happyBirthday();
        dog3.voice();

        //lesson 21, 22
        Dog dog4 = new Dog("Spot4", 7, "white");
        dog4.voice();
        dog4.changeColor("black");
        dog4.voice();
    }
}
