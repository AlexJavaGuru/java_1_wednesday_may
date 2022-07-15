package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3;

class Robot {
    String name;

    public Robot(String name) {
        this.name = name;

    }
    void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}
