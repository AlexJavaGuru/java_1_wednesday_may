package main.java.lv.javaguru.teacher.lesson_8_inheritance.lessoncode;

public class ApplePhone extends SmartPhone {

    public ApplePhone(String model, boolean networkAvailability, String os, int batteryCharge, int memorySize) {
        super(model, networkAvailability, os, batteryCharge, memorySize);
    }

    @Override
    public void transferData(String data) {
        System.out.println("Transferring data with AirDrop...");
    }

    @Override
    public void charge() {
        batteryCharge = batteryCharge + 10;
    }

    public void installingApps() {
        System.out.println("Buy it...");
    }
}
