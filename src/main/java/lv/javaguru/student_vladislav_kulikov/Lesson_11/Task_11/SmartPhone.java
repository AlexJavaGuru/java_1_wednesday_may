package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_11;

class SmartPhone extends Phone{

    private String model;
    private int batteryCharge;

    SmartPhone(String model, int batteryCharge) {
        super(model);
        this.batteryCharge = batteryCharge;
        Phone phone = new Phone(model);
    }

}
