package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_1_and_3;

class Robot {

    String name;

    public Robot(String name) {
        this.name = name;

    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
