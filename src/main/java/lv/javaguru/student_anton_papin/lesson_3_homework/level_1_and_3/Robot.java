package main.java.lv.javaguru.student_anton_papin.lesson_3_homework.level_1_and_3;

public class Robot {
    Robot() {
    }

    String name;

    Robot(String robotName) {

        this.name = robotName;
    }

    void sayHello() {
        System.out.println("Hello");

    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}

