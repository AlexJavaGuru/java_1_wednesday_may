package main.java.lv.javaguru.student_vladislava_lutkevichus.lesson_3;

public class Robot {
    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }



    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
