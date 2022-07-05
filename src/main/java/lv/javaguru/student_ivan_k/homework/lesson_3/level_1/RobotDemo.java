package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_1;

import main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_1.Robot;

public class RobotDemo {

    public static void main(String[] args) {

        String myName = "Ivan";
        System.out.println("Hello my name is " + myName);


        String userName = "Ivan";
        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);




        Robot robo1 = new Robot("ROBO", 2, false);
        Robot robo2 = new Robot("SHROBO");
        Robot robo3 = new Robot("Yakudza");
        Robot robo4 = new Robot("Kiborg");
        Robot robo5 = new Robot("Terminator");

        robo1.sayHello();
        robo1.sayYourName();
        robo2.sayHello();
        robo2.sayYourName();
        robo3.sayHello();
        robo3.sayYourName();
        robo4.sayHello();
        robo4.sayYourName();
        robo5.sayHello();
        robo5.sayYourName();

    }
}
