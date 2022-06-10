package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_3.Task_29;

public class Keyboard {

    private String name;
    String mode;
    String color;
    double drivers;

    Keyboard(String name,String mode, String color, double drivers){
        this.name = name;
        this.mode = mode;
        this.color = color;
        this.drivers = drivers;
    }

    void newColour(){
        color = "Color cycle";
    }

    void newMode(){
        mode = "Game mode";
    }

    void updateDrivers(){
        this.drivers = drivers +0.1;
    }

    String getName() {
        return name;
    }
}
