package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_29.SecondObject;

class Alarm {
    String alamModel;
    boolean wakeUp = false;

    public Alarm(String alamModel, boolean wakeUp) {
        this.alamModel = alamModel;
        this.wakeUp = wakeUp;
    }

    void wakeUp() {
        wakeUp = true;
        System.out.println("Trrrrrr....");
    }

    void turnOff() {
        wakeUp = false;
        System.out.println("Good morning! Have a nice day! Till tomorrow!");
    }

}
