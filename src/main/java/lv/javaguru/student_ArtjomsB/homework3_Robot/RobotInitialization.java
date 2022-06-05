package main.java.lv.javaguru.student_ArtjomsB.homework3_Robot;
import java.util.Scanner;

public class RobotInitialization {
    Scanner input = new Scanner(System.in);
    private String robotName;
    private boolean robotCondition;
    private int batteryLevel;
    public String getRobotName(){
        System.out.print("Type robot name:");
        this.robotName = input.nextLine();
        return this.robotName;
    }
    public boolean onOrOff(){
        System.out.println("Робот включён?");
        System.out.print("Если робот включён напишите 'y', если робот выключен напишите 'n'");
        String choice = input.nextLine();
        switch (choice){
            case "y" : this.robotCondition = true;
            break;
            case "n" : this.robotCondition = false;
            break;
            default : System.out.println("Status unknown");
        }
        return this.robotCondition;
    }
    public int inputBatteryLevel(){
        System.out.print("Input robot battery level:");
        this.batteryLevel= input.nextInt();
        return this.batteryLevel;
    }
}
