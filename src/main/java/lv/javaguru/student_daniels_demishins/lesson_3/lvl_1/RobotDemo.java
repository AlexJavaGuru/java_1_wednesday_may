package lv.javaguru.student_daniels_demishins.lesson_3.lvl_1;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1= new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2= new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
