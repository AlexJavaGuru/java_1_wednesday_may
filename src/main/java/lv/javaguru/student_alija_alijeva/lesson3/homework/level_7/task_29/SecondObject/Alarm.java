package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_29.SecondObject;

class Alarm {
    String alamModel;
    String wakeUp;
    String turnOff;

    public Alarm(String alamModel, String wakeUp, String turnOff) {
        this.alamModel = alamModel;
        this.turnOff = turnOff;
        this.wakeUp = wakeUp;
    }

    void wakeUp() {
        System.out.println("Trrrrrr....");
    }

    void turnOff() {
        System.out.println("Good morning! Have a nice day! Till tomorrow!");
    }

}
