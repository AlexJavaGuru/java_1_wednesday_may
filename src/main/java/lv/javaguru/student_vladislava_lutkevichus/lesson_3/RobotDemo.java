package lv.javaguru.student_vladislava_lutkevichus.lesson_3;

public class RobotDemo {

     public RobotDemo() {

     }

    public static void main(String[] args) {

            Robot myRobot = new Robot("Bob");
            myRobot.sayHello();
            myRobot.sayYourName();

            Robot robot1 = new Robot("Rider");
            robot1.sayHello();
            robot1.sayYourName();

            Robot robot2 = new Robot("John");
            robot2.sayHello();
            robot2.sayYourName();

    }
}
