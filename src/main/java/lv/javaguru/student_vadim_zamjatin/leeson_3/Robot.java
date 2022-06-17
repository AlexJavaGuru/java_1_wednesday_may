package main.java.lv.javaguru.student_vadim_zamjatin.leeson_3;

import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.URIDereferencer;

public class Robot {

    public Robot() {
    }

    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is" + this.name);
    }

}



