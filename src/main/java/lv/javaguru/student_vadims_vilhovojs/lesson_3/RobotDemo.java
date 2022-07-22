package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3;

class RobotDemo {
    public static void main(String[] args) {
        Robot terminator = new Robot("Terminator");

        terminator.sayHello();
        terminator.sayYourName();

        Robot robocop = new Robot("Robocop");
        robocop.sayHello();
        robocop.sayYourName();

        Robot optimusPrime = new Robot("Optimus Prime");
        optimusPrime.sayHello();
        optimusPrime.sayYourName();
    }

}
