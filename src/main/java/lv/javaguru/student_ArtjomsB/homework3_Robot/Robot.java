package main.java.lv.javaguru.student_ArtjomsB.homework3_Robot;

public class Robot {
    private String robotName;
    private boolean isOn;
    private int batteryLevel;
    public Robot(String robotName,boolean isOn,int batteryLevel){
        this.robotName = robotName;
        this.isOn = isOn;
        this.batteryLevel = batteryLevel;
    }
    //метод который говорит привет
    public void sayHello(){
        System.out.println("Hello!");
    }
    //метод говорит имя робота
    public void sayMyName(){
        System.out.println("My name is ROBO");
    }
    public void switchOn(){
        this.isOn= true;
        System.out.println("Robot turned on!");
    }
    public void switchOff(){
        this.isOn= false;
        System.out.println("Robot turned off!");
    }
    public void chargeStatus(){
        if (batteryLevel<16){
            System.out.println("Battery level too low, please charge the Robot");
        }
        else {
            System.out.println("Battery level is OK");}
    }
    public void robotStatus(){
        if(isOn == true) {
            System.out.println("Your robot is turned on");
        }
        else {
            System.out.println("Your robot is turned off");
        }
        System.out.println("Battery level=" + batteryLevel + "%");
        System.out.println("Robot name:" + robotName);
    };
}
