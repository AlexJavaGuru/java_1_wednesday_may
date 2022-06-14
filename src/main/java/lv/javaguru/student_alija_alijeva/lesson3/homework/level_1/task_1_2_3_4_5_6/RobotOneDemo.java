package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_1.task_1_2_3_4_5_6;

class RobotOneDemo {
    public static void main (String[] args){
        RobotOne ROB = new RobotOne("ROB");
        ROB.sayHello();
        ROB.sayYourName();

        RobotOne ROBCopyOne = new RobotOne();
        ROBCopyOne.sayHello();
        ROBCopyOne.sayYourName();

        RobotOne ROBCopyTwo = new RobotOne();
        ROBCopyTwo.sayHello();
        ROBCopyTwo.sayYourName();
    }
}
