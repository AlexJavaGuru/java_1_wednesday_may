package main.java.lv.javaguru.student_artjomsb_homework.homework3.homework3_robot.testing;
import java.util.Scanner;

class RobotInitialization {
    Scanner input = new Scanner(System.in);
    boolean isRobotOn;
    int batteryLevel;
    String setRobotName(){
        System.out.print("Type robot name:");
        String robotName = input.nextLine();
        return robotName;
    }
    boolean onOrOff(){
        System.out.println("Robot is on?");
        System.out.print("If robot on - write 'y',if robot off - write 'n'");
        String choice = input.nextLine();
        switch (choice) {
            case "y" -> this.isRobotOn = true;
            case "n" -> this.isRobotOn = false;
            default -> System.out.println("Status unknown");
        }
        return this.isRobotOn;
    }
    int inputBatteryLevel(){
        System.out.print("Input robot battery level:");
        this.batteryLevel = input.nextInt();
        return this.batteryLevel;
    }
}
