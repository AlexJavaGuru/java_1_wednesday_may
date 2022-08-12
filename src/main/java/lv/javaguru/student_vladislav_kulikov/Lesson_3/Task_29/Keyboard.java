package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_3.Task_29;

public class Keyboard {
    String name;
    String mode;
    String color;
    double drivers;

    Keyboard(String name,String mode, String color, double drivers){
        this.name = name;
        this.mode = mode;
        this.color = color;
        this.drivers = drivers;
    }

    void setColor(String color){
        this.color = color;
        System.out.println("New color has been set: " + color);
    }

    void setMode(String mode){
        this.mode = mode;
        System.out.println("Work mode has been changed: " + mode);
    }

    void increaseDrivers(double drivers){
       double sum = this.drivers + drivers;
       System.out.println("New drivers has been installed: " + sum);
       this.drivers = sum;
    }

    String getName() {
        return name;
    }
}
