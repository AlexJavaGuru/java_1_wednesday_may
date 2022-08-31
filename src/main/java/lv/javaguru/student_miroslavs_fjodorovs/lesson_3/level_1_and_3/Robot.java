package lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_1_and_3;

class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;
        }


    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName(){
        System.out.println("My name is " + this.name);
    }
}
