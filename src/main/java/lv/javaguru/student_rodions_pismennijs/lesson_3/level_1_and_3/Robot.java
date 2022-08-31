package lv.javaguru.student_rodions_pismennijs.lesson_3.level_1_and_3;

class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    void sayHello() {
        System.out.println("Hello");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
