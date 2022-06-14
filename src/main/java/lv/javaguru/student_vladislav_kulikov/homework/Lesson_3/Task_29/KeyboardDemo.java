package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_3.Task_29;

public class KeyboardDemo {

    public static void main(String[] args) {
        Keyboard logitech = new Keyboard("Logitech", "Quiet mode", "White", 1.0);

        System.out.println("Name of the keyboard: " + logitech.getName());
        System.out.println("Mode: " + logitech.mode);
        System.out.println("Color of backlight: " + logitech.color);
        System.out.println("Version of drivers:  " + logitech.drivers);

        logitech.setColor("Color cycle");
        logitech.increaseDrivers(3.0);
        logitech.setMode("Gaming mode");

    }
}
