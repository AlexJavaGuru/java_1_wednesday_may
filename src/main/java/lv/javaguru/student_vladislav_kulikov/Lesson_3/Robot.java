package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_3;

public class Robot{
    public Robot(){

    }
    public void sayHello(){
        System.out.println("Hello!");

    }
    public void sayYourName(){

        System.out.println("My name is " + this.name + "!");
    }
   String name;
    Robot(String robotName){
        this.name = robotName;
    }
}
    class RobotDemo{
     public static void main(String[] args) {
        Robot robotOne = new Robot("Jack");
        robotOne.sayHello();
        robotOne.sayYourName();
        System.out.println(robotOne);

        Robot robotTwo = new Robot("John");
        robotTwo.sayHello();
        robotTwo.sayYourName();
        System.out.println(robotTwo);

        Robot robotThree = new Robot("Martin");
        robotThree.sayHello();
        robotThree.sayYourName();
        System.out.println(robotThree);
    }

}