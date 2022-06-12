package main.java.lv.javaguru.student_ivan_k.homework.lesson_3;

public class Robot {
    String name;
    int age;
    boolean isHungry;


    public Robot(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }
    public Robot(String name){
        this.name = name;
    }



    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName(){
        System.out.println("My name is " + name + "!");
    }
}
