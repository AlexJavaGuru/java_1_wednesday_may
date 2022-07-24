package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_3.task_11_12_13;

class Robot {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name + "!");
    }
}
