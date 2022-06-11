package main.java.lv.javaguru.student_ArtjomsB_homework.homework3_Robot;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robotOne = new Robot("Savior", false, 3);

        Robot robotTwo = new Robot("Destroyer",true,63);

        robotOne.sayHello();
        robotOne.sayMyName();
        System.out.println("Robot status: ");
        robotOne.robotStatus();

        System.out.println();

        robotTwo.sayHello();
        robotTwo.sayMyName();
        System.out.println("Robot status: ");
        robotTwo.robotStatus();
    }
}
