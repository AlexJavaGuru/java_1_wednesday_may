package main.java.lv.javaguru.student_artjomsb_homework.homework3.homework3_robot.testing;

public class RobotTestDemo {
    public static void main(String[] args) {
        //создаём виртуального робота 1
        RobotTest robotOne = new RobotTest("Savior", false, 3);
        //создаём виртуального робота 2
        RobotTest robotTwo = new RobotTest("Destroyer",true,63);
        //методы для робота 1
        robotOne.sayHello();
        robotOne.sayMyName();
        //методы для робота 2
        robotTwo.sayHello();
        robotTwo.sayMyName();
    }
}
