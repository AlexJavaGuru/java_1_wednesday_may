package lv.javaguru.student_alija_alijeva.lesson3.homework.level_1.task_1_2_3_4_5_6;

class RobotOneDemo {
    public static void main(String[] args) {
        RobotOne rob = new RobotOne("ROB");
        rob.sayHello();
        rob.sayYourName();

        RobotOne robCopyOne = new RobotOne();
        robCopyOne.sayHello();
        robCopyOne.sayYourName();

        RobotOne robCopyTwo = new RobotOne();
        robCopyTwo.sayHello();
        robCopyTwo.sayYourName();
    }
}
