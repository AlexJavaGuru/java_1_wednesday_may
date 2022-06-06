package main.java.lv.javaguru.student_ArtjomsB_homework.homework3_Robot;
import java.util.Scanner;

public class RobotInitialization {
    Scanner input = new Scanner(System.in);
    boolean isRobotOn;
    int batteryLevel;
    public String getRobotName(){
        System.out.print("Type robot name:");
        String robotName = input.nextLine();
        return robotName;
    }
    public boolean onOrOff(){
        System.out.println("Робот включён?");
        System.out.print("Если робот включён напишите 'y', если робот выключен напишите 'n'");
        String choice = input.nextLine();
        switch (choice) {
            case "y" -> this.isRobotOn = true;
            case "n" -> this.isRobotOn = false;
            default -> System.out.println("Status unknown");
        }
        return this.isRobotOn;
    }
    public int inputBatteryLevel(){
        System.out.print("Input robot battery level:");
        this.batteryLevel = input.nextInt();
        return this.batteryLevel;
    }
}
