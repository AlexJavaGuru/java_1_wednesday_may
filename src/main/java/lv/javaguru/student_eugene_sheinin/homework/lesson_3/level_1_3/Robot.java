package lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_1_3;

public class Robot {

    String name;

    public Robot(String robotName){
        this.name = robotName;

    }

    public void sayHello() {

        // тут напишите команду распечатки на консоли строки "Hello!"
        System.out.println("Hello");
    }

    public void sayYourName() {
        // тут напишите команду распечатки на консоли строки "My name is ROBO"
        System.out.println("My name is " + this.name);
    }


}
