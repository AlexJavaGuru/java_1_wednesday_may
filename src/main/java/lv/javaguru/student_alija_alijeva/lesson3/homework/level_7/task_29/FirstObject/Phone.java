package lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_29.FirstObject;

class Phone {
    String modelPhone;
    int battery;
    boolean logOff;

    public Phone(String modelPhone, int battery, boolean logOff) {
        this.modelPhone = modelPhone;
        this.battery = battery;
        this.logOff = logOff;
    }

    void turnOn() {
        System.out.println("Hi! I have a " + battery + "%");
        logOff = false;
    }

    void charge() {
        System.out.println((battery + 5) + "%");
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    void setLogOff() {
    logOff = true;
    System.out.println("Phone is turned off");
    }
}

