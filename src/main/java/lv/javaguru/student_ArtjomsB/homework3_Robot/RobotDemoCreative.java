package main.java.lv.javaguru.student_ArtjomsB.homework3_Robot;

public class RobotDemoCreative {
    public static void main(String[] args) {
        //робот 3
        RobotInitialization init = new RobotInitialization();
        String robotName1 = init.getRobotName();
        Robot robotThree = new Robot(robotName1,false,3);
        robotThree.robotStatus();
        //robot 4
        String robotName2 = init.getRobotName();
        boolean robot2IsOn = init.onOrOff();
        int robot2BatteryLevel =init.inputBatteryLevel();
        Robot robotFour = new Robot(robotName2, robot2IsOn,robot2BatteryLevel);
        robotFour.robotStatus();
    }
}
