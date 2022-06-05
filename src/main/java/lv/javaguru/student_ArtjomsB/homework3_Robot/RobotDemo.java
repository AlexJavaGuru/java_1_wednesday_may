package main.java.lv.javaguru.student_ArtjomsB.homework3_Robot;

public class RobotDemo {
    public static void main(String[] args) {
        //создаём виртуального робота 1
        Robot robotOne = new Robot("Savior", false, 3);
        //создаём виртуального робота 2
        Robot robotTwo = new Robot("Destroyer",true,63);
        //методы для робота 1
        robotOne.sayHello();
        robotOne.sayMyName();
        //методы для робота 2
        robotTwo.sayHello();
        robotTwo.sayMyName();
    }
}
