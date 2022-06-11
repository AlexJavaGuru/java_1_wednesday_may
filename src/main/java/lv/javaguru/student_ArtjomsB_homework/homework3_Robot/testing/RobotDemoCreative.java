package main.java.lv.javaguru.student_ArtjomsB_homework.homework3_Robot.testing;

public class RobotDemoCreative {
    public static void main(String[] args) {
        //робот 3
        RobotInitialization init = new RobotInitialization();
        String robotName1 = init.getRobotName();
        RobotTest robotThree = new RobotTest(robotName1,false,3);
        robotThree.robotStatus();
        robotThree.switchOn();
        robotThree.robotStatus();
        //robot 4
        String robotName2 = init.getRobotName();
        boolean isRobot2On = init.onOrOff();
        int robot2BatteryLevel =init.inputBatteryLevel();
        RobotTest robotFour = new RobotTest(robotName2, isRobot2On,robot2BatteryLevel);
        robotFour.robotStatus();
        robotFour.chargeStatus();
        robotFour.switchOff();
        robotFour.robotStatus();
        robotFour.chargeRobot();
        System.out.println();
        System.out.println("Robot status");
        robotFour.robotStatus();
    }
}
