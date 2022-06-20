package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_29.FirstObject;

class Phone {
    String modelPhone;
    int battery;
    String colour;

    public Phone(String modelPhone, int battery, String colour) {
        this.modelPhone = modelPhone;
        this.battery = battery;
        this.colour = colour;
    }

    void turnOn() {
        System.out.println("Hi! I have a " + battery + "%");
    }

    void charge() {
        System.out.println((battery + 5) + "%");
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
