package main.java.lv.javaguru.student_artjomsb_homework.homework3.homework3_robot.testing;

class RobotTest {
    String robotName;
    boolean isOn;
    int batteryLevel;

    RobotTest(String robotName, boolean isOn, int batteryLevel) {
        this.robotName = robotName;
        this.isOn = isOn;
        this.batteryLevel = batteryLevel;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void sayMyName() {
        System.out.println("My name is ROBO");
    }

    void switchOn() {
        this.isOn = true;
        System.out.println("Robot turned on!");
    }

    void switchOff() {
        this.isOn = false;
        System.out.println("Robot turned off!");
    }

    void chargeStatus() {
        if (batteryLevel < 16) {
            System.out.println("Battery level too low, please charge the Robot");
        } else {
            System.out.println("Battery level is OK");
        }
    }

    void robotStatus() {
        if (isOn) {
            System.out.println("Your robot is turned on");
        } else {
            System.out.println("Your robot is turned off");
        }
        System.out.println("Battery level=" + batteryLevel + "%");
        System.out.println("Robot name:" + robotName);
    }

    void chargeRobot() {
        batteryLevel = 100;
    }
}
