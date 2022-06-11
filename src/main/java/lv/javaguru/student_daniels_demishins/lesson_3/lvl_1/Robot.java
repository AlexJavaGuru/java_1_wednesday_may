package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_1;

public class Robot {
    String name;

    public Robot(String name) {
        this.name= name;

    }
    public void sayHello(){
        System.out.println("Hello....");
    }
    public void sayYourName(){
        System.out.println("My name is "+this.name);
    }
}

