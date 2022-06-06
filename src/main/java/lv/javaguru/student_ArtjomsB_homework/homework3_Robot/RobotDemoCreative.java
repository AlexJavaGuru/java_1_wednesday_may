package main.java.lv.javaguru.student_ArtjomsB_homework.homework3_Robot;

public class RobotDemoCreative {
    public static void main(String[] args) {
        //робот 3
        RobotInitialization init = new RobotInitialization();
        String robotName1 = init.getRobotName();
        Robot robotThree = new Robot(robotName1,false,3);
        robotThree.robotStatus();
        robotThree.switchOn();
        robotThree.robotStatus();
        //robot 4
        String robotName2 = init.getRobotName();
        boolean isRobot2On = init.onOrOff();
        int robot2BatteryLevel =init.inputBatteryLevel();
        Robot robotFour = new Robot(robotName2, isRobot2On,robot2BatteryLevel);
        robotFour.robotStatus();
        robotFour.chargeStatus();
        robotFour.switchOff();
        robotFour.robotStatus();
    }
}
