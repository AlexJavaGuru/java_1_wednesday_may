package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_1;

public class Robot {
    String name;

     Robot(String name) {
        this.name= name;

    }
     void sayHello(){
        System.out.println("Hello....");
    }
     void sayYourName(){
        System.out.println("My name is "+this.name);
    }
}

